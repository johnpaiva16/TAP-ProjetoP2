package view;

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
        Cliente c = new Cliente();

        c.setCod(3);
        c.setNome("Joao");
        c.setCpf("12343");
        c.setRg("12124");

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
