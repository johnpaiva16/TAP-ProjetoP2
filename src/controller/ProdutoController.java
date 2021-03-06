/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GenericDAO;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityExistsException;
import model.Estoque;
import model.Produto;

/**
 *
 * @author jesp
 */
public class ProdutoController {

    private final GenericDAO dao;
    private final String TABLE_NAME;

    public ProdutoController() {
        dao = new GenericDAO();
        this.TABLE_NAME = "produto";
    }

    public boolean saveProduto(Produto p) throws EntityExistsException, SQLException {
        Estoque itemE = new Estoque();
        EstoqueController estoqueController = new EstoqueController();

        p = (Produto) dao.save(p);
        if (p.getCod() != 0) {
            itemE.setProduto(p);
            itemE.setQtd(0);
            estoqueController.saveProdutoEstoque(itemE);
            return true;

        }
        return false;
    }

    public Produto updateProduto(Produto fornecedor) {
        return (Produto) dao.update(fornecedor);
    }

    public List<Produto> findAllProdutos() throws SQLException {
        return dao.findAll(TABLE_NAME);
    }

    public Produto findProdutoByCod(int id) throws SQLException {
        return (Produto) dao.findByCod(id, TABLE_NAME);

    }

    public void deleteProduto(int id) throws SQLException {
        EstoqueController estoqueController = new EstoqueController();
        estoqueController.deleteProdutoEstoque(id);
     
        Produto p = findProdutoByCod(id);
        dao.delete(p);
    }
}
