package controller;

import dao.GenericDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import model.Estoque;

public class EstoqueController {

    GenericDAO dao = new GenericDAO();
    private final String TABLE_NAME = "estoque";

    public void saveProdutoEstoque(Estoque itemEstoque) throws EntityExistsException, SQLException {
        dao.save(itemEstoque);

    }

    public void updateEstoque(Estoque itemEstoque) throws EntityExistsException, SQLException {
        dao.update(itemEstoque);

    }

    public void deleteProdutoEstoque(int codProduto) throws SQLException {
        Estoque e = findByCodProdutoEstoque(codProduto);
        dao.delete(e);
    }

    public Estoque findByCodProdutoEstoque(int codProd) throws SQLException {
        return (Estoque) dao.findByCod(codProd, TABLE_NAME);
    }

    public List<Estoque> findAllProdutoEstoque() throws SQLException {
        return dao.findAll(TABLE_NAME);
    }
}
