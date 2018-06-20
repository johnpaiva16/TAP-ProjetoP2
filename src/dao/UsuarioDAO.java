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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import util.ConnectionUtilJDBC;

/**
 *
 * @author jesp
 */
public class UsuarioDAO {

    protected Connection conn;
    protected PreparedStatement stmt;

    public UsuarioDAO() {
        conn = ConnectionUtilJDBC.getConnection();
    }

    public Usuario findUsuario(String login) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        Usuario u = null;

        stmt = conn.prepareStatement(sql);
        stmt.setString(1, login);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            u = new Usuario();
            u.setLogin(login);
            u.setSenha(rs.getString(2));
            u.setAdmin(rs.getBoolean(3));
        }

        return u;
    }
}
