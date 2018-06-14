/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GenericDAO;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author jesp
 */
public class FornecedorController {
    
     private final GenericDAO dao;
    private final String TABLE_NAME;

    public FornecedorController() {
        dao= new GenericDAO();
        this.TABLE_NAME = "fornecedor";
    }
    
    public Fornecedor saveFornecedor(Fornecedor fornecedor){
      if (fornecedor.getCod() != 0 && fornecedor.getEndereco().getCod() != 0) {
        return  (Fornecedor) dao.save(fornecedor);
      }
      return null;
    }
    public Fornecedor updateFornecedor(Fornecedor fornecedor){
       return (Fornecedor) dao.update(fornecedor);
    }
    public List<Fornecedor> findAllFornecedores(){
        return dao.findAll(TABLE_NAME);
    }
      public Fornecedor findFornecedorByCod(int id) {
        return (Fornecedor) dao.findByCod(id);

    }
    public void deleteFornecedor(int id) {
        Fornecedor f = findFornecedorByCod(id);
        dao.delete(f);
    }
}
