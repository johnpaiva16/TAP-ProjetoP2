package controller;

import dao.EstoqueDAO;
import dao.GenericDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import model.Estoque;
import model.ItemVenda;

public class EstoqueController {

    protected GenericDAO dao = new GenericDAO();
    protected EstoqueDAO eDao = new EstoqueDAO();
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
    
    public boolean qtdSuficiente(int codProd, int qtdRequerida) throws SQLException {
        if(eDao.getQtdProduto(codProd) >= qtdRequerida){
            return true;
        }
        return false;
    }
    public void subtraiQtdVendida(List<ItemVenda> itens) throws SQLException{
        for(ItemVenda item : itens){
           int qtdEstoque = eDao.getQtdProduto(item.getProduto().getCod());
           Estoque e = new Estoque();
           e.setProduto(item.getProduto());
           e.setQtd(qtdEstoque - item.getQtd());
           eDao.atualizaQtdProduto(e);
        }
    }    
}
