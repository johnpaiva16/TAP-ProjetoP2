package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;
import model.Fornecedor;

/**
 *
 * @author jesp
 */
public class GenericDAO<T> {

    EntityManagerFactory emf;
    EntityManager em;

    public void save(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor) {
            saveWithHibernate(obj);
        } else {

        }
    }

    public void update(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor) {
            saveWithHibernate(obj);
        } else {
        }
    }

    private void saveWithHibernate(T obj) {
       initEMF(obj);
       em = emf.createEntityManager(); 
       em.getTransaction().begin();
       em.merge(obj);
       em.getTransaction().commit();
       em.close();
       
    }

    public List<T> listAll(String tableName) {
        List<T> list = null;
        String sql = "";
        if (tableName.equals("cliente") || tableName.equals("fornecedor")) {

                emf = Persistence.createEntityManagerFactory("cliente");
                em = emf.createEntityManager();
                em.getTransaction().begin();
                sql = "SELECT cliente FROM Cliente cliente";
                Query q = em.createQuery(sql);
                list = q.getResultList();
            
            em.getTransaction().commit();
            em.close();
        }
        return list;
    }

    public void delete(T obj) {
        String sql = "";
        if (obj instanceof Cliente || obj instanceof Fornecedor) {

            if (obj instanceof Cliente) {
                Cliente cliente = (Cliente) obj;
                emf = Persistence.createEntityManagerFactory("cliente");
                em = emf.createEntityManager();
                em.getTransaction().begin();
                sql = "DELETE cliente FROM cliente WHERE cod = " + ((Cliente) obj).getCod();
                Query q = em.createNativeQuery(sql);
                q.executeUpdate();
            }
            em.getTransaction().commit();
            em.close();
        } else {

        }

    }
    private void initEMF (T obj){
       String entity = (obj.getClass().getName());
       emf = Persistence.createEntityManagerFactory((entity.substring(entity.lastIndexOf('.')+1)).toLowerCase());
    }
}
