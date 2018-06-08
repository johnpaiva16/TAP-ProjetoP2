/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.GenericDAO;
import model.Cliente;

/**
 *
 * @author jesp
 */
public class TesteMain {
    
    public static void main(String [] args){
        GenericDAO dao = new GenericDAO();
        Cliente c = new Cliente();
        
        c.setCod(1);
        c.setNome("Jose");
        c.setCpf("12344343");
        c.setRg("1212124");
        
        dao.update(c);
    }
}
