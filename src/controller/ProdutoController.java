/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GenericDAO;
import java.util.List;
import model.Produto;

/**
 *
 * @author jesp
 */
public class ProdutoController {
    
    
      private final GenericDAO dao;
    private final String TABLE_NAME;

    public ProdutoController() {
        dao= new GenericDAO();
        this.TABLE_NAME = "produto";
    }
    
    public Produto saveFornecedor(Produto p){
      if (p.getCod() != 0) {
        return  (Produto) dao.save(p);
      }
      return null;
    }
    public Produto updateFornecedor(Produto fornecedor){
       return (Produto) dao.update(fornecedor);
    }
    public List<Produto> findAllFornecedores(){
        return dao.findAll(TABLE_NAME);
    }
      public Produto findFornecedorByCod(int id) {
        return (Produto) dao.findByCod(id);

    }
    public void deleteFornecedor(int id) {
        Produto p = findFornecedorByCod(id);
        dao.delete(p);
    }
}
