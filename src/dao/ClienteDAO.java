/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.Endereco;
import util.ConnectionUtilJDBC;

/**
 *
 * @author jesp
 */
public class ClienteDAO {

    protected PreparedStatement stmt;
    protected Connection conn;
    protected EntityManagerFactory emf;
    protected EntityManager em;

    private void loadEM() {
        emf = Persistence.createEntityManagerFactory("farmaciaPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
     public Cliente findByCpf(String cpf) throws SQLException {
        Cliente c = null;
        conn = ConnectionUtilJDBC.getConnection();
        String sql = "SELECT * FROM cliente INNER JOIN endereco ON endereco_cod = endereco.cod WHERE cpf = ?";

        stmt = conn.prepareStatement(sql);
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            c = new Cliente();
            c.setEndereco(new Endereco());

            c.setCod(rs.getInt(1));
            c.setCpf(rs.getString(2));
            c.setDataNascimento(rs.getString(3));
            c.setNome(rs.getString(4));
            c.setSexo(rs.getString(5));
            c.setTelefone(rs.getString(6));
            c.getEndereco().setCod(rs.getInt(8));
            c.getEndereco().setCep(rs.getString(9));
            c.getEndereco().setLogradouro(rs.getString(10));
            c.getEndereco().setBairro(rs.getString(11));
            c.getEndereco().setCidade(rs.getString(12));
            c.getEndereco().setEstado(rs.getString(13));
        }
        return c;
    }
}
