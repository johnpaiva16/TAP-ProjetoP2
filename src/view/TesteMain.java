package view;

import controller.ClienteController;
import dao.GenericDAO;
import java.util.List;
import model.Cliente;

/**
 *
 * @author jesp
 */
public class TesteMain {

    public static void main(String[] args) {
        GenericDAO dao = new GenericDAO();
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente();

       // c.setCod(3);
        c.setNome("Joaquim");
        c.setCpf("12343");
        c.setRg("12124");

        cc.saveClient(c);
        //dao.save(c);
        //dao.update(c);
        //dao.delete(c);
        /*
        List<Cliente> l = dao.listAll("cliente");
        for (Cliente cl : l) {
            System.out.println(cl.getCod() + " | " + cl.getNome());

        }*/

    }
}
