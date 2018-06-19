package dao;

import util.ConnectionUtilJDBC;
import com.sun.xml.internal.ws.util.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;
import model.Fornecedor;
import model.ItemVenda;
import model.Produto;
import model.Usuario;
import model.Venda;
import util.CreateTables;

/**
 *
 * @author jesp
 * @param <T>
 */
public class GenericDAO<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;
    protected Connection conn;
    protected PreparedStatement stmt;

    private void loadEM() {
        emf = Persistence.createEntityManagerFactory("farmaciaPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    private void loadConectionJDBC() {
        conn = ConnectionUtilJDBC.getConnection();
    }

    public T save(T obj) {
        //JPA HIBERNATE
        if (obj instanceof Cliente || obj instanceof Fornecedor || obj instanceof Produto) {
            try {
                loadEM();
                em.persist(obj);
                em.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
            }
        } else {
            //JDBC
            if (obj instanceof Venda) {

                CreateTables ct = new CreateTables();
                Venda v = (Venda) obj;

                String insertTableVenda = "INSERT INTO Venda (subtotal, desconto, valorTotal, data, cod_cliente) VALUES (?,?,?,?,?)";
                String insertTableItens = "INSERT INTO ItensVenda (cod_produto, qtd_produto, cod_venda) VALUES(?,?,?)";
                try {
                    loadConectionJDBC();
                    stmt = conn.prepareStatement(insertTableVenda, Statement.RETURN_GENERATED_KEYS);
                    stmt.setDouble(1, v.getSubtotal());
                    stmt.setDouble(2, v.getDesconto());
                    stmt.setDouble(3, v.getValorTotal());
                    stmt.setString(4, v.getData());
                    stmt.setInt(5, v.getCliente().getCod());
                    stmt.executeUpdate();

                    ResultSet rs = stmt.getGeneratedKeys();
                    if (rs.next()) {
                        v.setCod(rs.getInt(1));
                    }

                    PreparedStatement stmt2 = conn.prepareStatement(insertTableItens);
                    List<ItemVenda> itens = v.getItens();
                    for (ItemVenda item : itens) {

                        stmt2.setInt(1, item.getProduto().getCod());
                        stmt2.setInt(2, item.getQtd());
                        stmt2.setInt(3, v.getCod());
                        stmt2.executeUpdate();
                    }
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();

                }

            }
        }
        return obj;
    }

    public T update(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor || obj instanceof Produto) {
            try {
                loadEM();
                em.merge(obj);
                em.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
            }
        } else {
        }
        return obj;
    }

    public List<T> findAll(String tableName) {
        tableName = tableName.toLowerCase();
        List<T> list = null;
        String sql = "";

        if (tableName.equals("cliente") || tableName.equals("fornecedor") || tableName.equals("produto")) {
            try {
                loadEM();
                sql = "SELECT " + tableName + " FROM " + StringUtils.capitalize(tableName) + " " + tableName;
                Query q = em.createQuery(sql);
                list = q.getResultList();
                em.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
            }
        } else {
        }
        return list;
    }

    public void delete(T t) {

        if (t instanceof Cliente || t instanceof Fornecedor || t instanceof Produto) {
            try {
                loadEM();
                Object obj = null;
                if (t instanceof Cliente) {
                    obj = em.find(Cliente.class, ((Cliente) t).getCod());

                } else if (t instanceof Fornecedor) {
                    obj = em.find(Fornecedor.class, ((Fornecedor) t).getCod());
                } else if (t instanceof Produto) {
                    obj = em.find(Produto.class, ((Produto) t).getCod());
                }
                em.remove(obj);
                em.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
            }
        }

    }

    public T findByCod(int cod, String tableName) {
        Object obj = null;
        try {
            loadEM();
            if (tableName.toLowerCase().equals("produto")) {
                obj = em.find(Produto.class, cod);
            } else if (tableName.toLowerCase().equals("cliente")) {
                obj = em.find(Cliente.class, cod);
            } else if (tableName.toLowerCase().equals("fornecedor")) {
                obj = em.find(Fornecedor.class, cod);
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return (T) obj;
    }

}
