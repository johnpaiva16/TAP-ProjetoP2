/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static java.util.Collections.list;
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
            if (obj instanceof Cliente) {
                emf = Persistence.createEntityManagerFactory("cliente");
                em = emf.createEntityManager();
            } else if (obj instanceof Fornecedor) {
                emf = Persistence.createEntityManagerFactory("fornecedor");
                em = emf.createEntityManager();
            }
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            em.close();
        } else {
        }
    }

    public void update(T obj) {
        if (obj instanceof Cliente || obj instanceof Fornecedor) {
            if (obj instanceof Cliente) {
                emf = Persistence.createEntityManagerFactory("cliente");
                em = emf.createEntityManager();
            } else if (obj instanceof Fornecedor) {
                emf = Persistence.createEntityManagerFactory("fornecedor");
                em = emf.createEntityManager();
            }
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            em.close();
        } else {
        }
    }
    
    public List<T> listAll(String tableName) {
        List<T> list = null;
        String sql = "";
        if (tableName.equals("cliente") || tableName.equals("fornecedor")) {
            emf = Persistence.createEntityManagerFactory("cliente");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            if (tableName.equals("cliente")) {
                sql = "SELECT cliente FROM Cliente cliente";
                Query q = em.createQuery(sql);
                list = q.getResultList();
            }
            em.getTransaction().commit();
            em.close();
        }
        return list;
    }

}
