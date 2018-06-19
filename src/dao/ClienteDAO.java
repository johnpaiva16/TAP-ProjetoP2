/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cliente;

/**
 *
 * @author jesp
 */
public class ClienteDAO {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    private void loadEM() {
        emf = Persistence.createEntityManagerFactory("farmaciaPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public Cliente findByCpf(String cpf) {
        Cliente c = null;
        String sql = "SELECT cliente FROM Cliente cliente WHERE cpf = " + cpf;

        loadEM();
        Query q = em.createQuery(sql);
        c = (Cliente) q.getSingleResult();
        em.getTransaction().commit();
        em.close();
        return c;

    }
}
