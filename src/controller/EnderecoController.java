/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GenericDAO;
import model.Endereco;


public class EnderecoController {
    
    GenericDAO dao = new GenericDAO();
    
    public Endereco saveAddress(Endereco endereco){
       return (Endereco) dao.save(endereco);
    }
}
