package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Estoque;
import model.ItemVenda;
import model.Produto;
import util.ConnectionUtilJDBC;

public class EstoqueDAO {

    protected PreparedStatement stmt;
    protected Connection conn;

    public int getQtdProduto(int codProduto) throws SQLException {
        int qtd = 0;
        conn = ConnectionUtilJDBC.getConnection();
        String sql = "SELECT qtd FROM estoque WHERE produto_cod = ?";

        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, codProduto);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            qtd = rs.getInt(1);
        }
        return qtd;
    }
    
    public void atualizaQtdProduto(Estoque item) throws SQLException {
        
        conn = ConnectionUtilJDBC.getConnection();
        String sql = "UPDATE estoque set qtd = ? WHERE produto_cod = ?";

        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, item.getQtd());
        stmt.setInt(2, item.getProduto().getCod());
       
        stmt.executeUpdate();
        
    }

}
