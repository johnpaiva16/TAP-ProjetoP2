
package controller;

import dao.GenericDAO;
import model.Cliente;
import util.Utils;


public class ClienteController {
    
    public void saveClient(Cliente c){
        if(Utils.validaCpf(c.getCpf())){
            GenericDAO dao = new GenericDAO();
            dao.save(c);
        }
    }
    public void updateClient(Cliente c){
        if(Utils.validaCpf(c.getCpf())){
            GenericDAO dao = new GenericDAO();
            dao.update(c);
        }
    }
}
