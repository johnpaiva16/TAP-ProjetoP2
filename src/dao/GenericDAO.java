package dao;

import util.ConnectionUtilJDBC;
import com.sun.xml.internal.ws.util.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;
import model.Fornecedor;
import model.Produto;
import model.Venda;
import util.CreateTables;

/**
 *
 * @author jesp
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
        if (obj instanceof Cliente || obj instanceof Fornecedor || obj instanceof Produto) {
            
            saveWithHibernate(obj);
        } else {
            
            if (obj instanceof Venda) {
                
                CreateTables ct = new CreateTables();
                Venda v = (Venda)obj;
                
                String insertTableVenda = "INSERT INTO Venda (subtotal, desconto, valorTotal, data) VALUES(?,?,?,?)";

                try {
                System.out.println("OK");
                    ct.executaSQL();

                    loadConectionJDBC();
                    stmt = conn.prepareStatement(insertTableVenda);
                    stmt.setDouble(1, v.getSubtotal());
                    stmt.setDouble(2, v.getDesconto());
                    stmt.setDouble(3, v.getValorTotal());
                    stmt.setString(4, v.getData());
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        return obj;
    }

    public T update(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor) {
            saveWithHibernate(obj);
        } else {
        }
        return obj;
    }

    private T saveWithHibernate(T obj) {
        try {
            loadEM();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return obj;
    }

    public List<T> findAll(String tableName) {
        tableName = tableName.toLowerCase();
        List<T> list = null;
        String sql = "";

        if (tableName.equals("cliente") || tableName.equals("fornecedor")) {
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
        }
        return list;
    }

    public void delete(T t) {

        if (t instanceof Cliente || t instanceof Fornecedor) {
            try {
                loadEM();
                Object obj = null;
                if (t instanceof Cliente) {
                    obj = em.find(Cliente.class, ((Cliente) t).getCod());

                } else if (t instanceof Fornecedor) {
                    obj = em.find(Fornecedor.class, ((Fornecedor) t).getCod());
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

    public T findByCod(int cod) {
        Object obj = null;
        try {
            loadEM();

            obj = em.find(Cliente.class, cod);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return (T) obj;
    }

}
