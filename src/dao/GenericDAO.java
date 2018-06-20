package dao;

import util.ConnectionUtilJDBC;
import com.sun.xml.internal.ws.util.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;
import model.Fornecedor;
import model.ItemVenda;
import model.Produto;
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

    public T save(T obj) throws EntityExistsException, SQLException {
        //JPA HIBERNATE
        if (obj instanceof Cliente || obj instanceof Fornecedor || obj instanceof Produto) {
            loadEM();
            em.persist(obj);
            em.getTransaction().commit();
            em.close();

        } else {
            //JDBC
            if (obj instanceof Venda) {

                CreateTables ct = new CreateTables();
                Venda v = (Venda) obj;

                String insertTableVenda = "INSERT INTO Venda (subtotal, desconto, valorTotal, data, hora, cod_cliente) VALUES (?,?,?,?,?,?)";
                String insertTableItens = "INSERT INTO ItensVenda (cod_produto, qtd_produto, cod_venda) VALUES(?,?,?)";

                loadConectionJDBC();
                stmt = conn.prepareStatement(insertTableVenda, Statement.RETURN_GENERATED_KEYS);
                stmt.setDouble(1, v.getSubtotal());
                stmt.setDouble(2, v.getDesconto());
                stmt.setDouble(3, v.getValorTotal());
                stmt.setString(4, v.getData());
                stmt.setString(5, v.getHora());
                if (v.getCliente().getCod() != 0) {
                    stmt.setInt(6, v.getCliente().getCod());
                } else {
                    stmt.setNull(6, 0);
                }
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

            }
        }
        return obj;
    }

    public T update(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor || obj instanceof Produto) {

            loadEM();
            em.merge(obj);
            em.getTransaction().commit();
            em.close();

        } else {

        }
        return obj;
    }

    public List<T> findAll(String tableName) throws SQLException {
        tableName = tableName.toLowerCase();
        List<T> list = null;
        String sql = "";

        if (tableName.equals("cliente") || tableName.equals("fornecedor") || tableName.equals("produto")) {

            loadEM();
            sql = "SELECT " + tableName + " FROM " + StringUtils.capitalize(tableName) + " " + tableName;
            Query q = em.createQuery(sql);
            list = q.getResultList();
            em.getTransaction().commit();

            em.close();

        } else {
            if (tableName.toLowerCase().equals("venda")) {

                list = new ArrayList<>();
                loadConectionJDBC();
                sql = "SELECT * FROM venda";

                stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Venda v = new Venda();
                    v.setCod(rs.getInt(1));
                    v.setSubtotal(rs.getDouble(2));
                    v.setDesconto(rs.getDouble(3));
                    v.setValorTotal(rs.getDouble(4));
                    v.setData(rs.getString(5));
                    v.setHora(rs.getString(6));
                    v.getCliente().setCod(rs.getInt(7));
                    list.add((T) v);

                }
            }
        }
        return list;
    }

    public void delete(T t) {

        if (t instanceof Cliente || t instanceof Fornecedor || t instanceof Produto) {

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

            em.close();

        }

    }

    public T findByCod(int cod, String tableName) throws SQLException {
        tableName = tableName.toLowerCase();
        Object obj = null;
        if (tableName.equals("cliente") || tableName.equals("fornecedor") || tableName.equals("produto")) {
            loadEM();
            if (tableName.toLowerCase().equals("produto")) {
                obj = em.find(Produto.class, cod);
            } else if (tableName.toLowerCase().equals("cliente")) {
                obj = em.find(Cliente.class, cod);
            } else if (tableName.toLowerCase().equals("fornecedor")) {
                obj = em.find(Fornecedor.class, cod);
            }
            em.getTransaction().commit();
            em.close();
        } else {
            if (tableName.equals("venda")) {
                loadConectionJDBC();
                String sql = "SELECT * FROM venda WHERE cod = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, cod);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    Venda v = new Venda();
                    v.setCod(rs.getInt(1));
                    v.setSubtotal(rs.getDouble(2));
                    v.setDesconto(rs.getDouble(3));
                    v.setValorTotal(rs.getDouble(4));
                    v.setData(rs.getString(5));
                    v.setHora(rs.getString(6));
                    v.getCliente().setCod(rs.getInt(7));
                    obj = v;
                }
            }
        }
        return (T) obj;
    }

}
