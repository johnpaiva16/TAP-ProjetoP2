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
    
    public Produto saveProduto(Produto p){
     
        return  (Produto) dao.save(p);
     
     
    }
    public Produto updateProduto(Produto fornecedor){
       return (Produto) dao.update(fornecedor);
    }
    public List<Produto> findAllProdutos(){
        return dao.findAll(TABLE_NAME);
    }
      public Produto findProdutoByCod(int id) {
        return (Produto) dao.findByCod(id);

    }
    public void deleteProduto(int id) {
        Produto p = findProdutoByCod(id);
        dao.delete(p);
    }
}
