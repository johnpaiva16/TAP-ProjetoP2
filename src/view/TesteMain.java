package view;

import controller.ClienteController;
import dao.ClienteDAO;
import dao.GenericDAO;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import model.Cliente;
import model.Endereco;
/**
 *
 * @author jesp
 */
public class TesteMain extends Application {

    public static void main(String[] args) {
        //launch(args);
        
        //GenericDAO dao = new GenericDAO();
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente();
       // ClienteDAO cliDao = new ClienteDAO();
        
        Endereco end = new Endereco();
        //end.setCep("54270110");
       // c.setCod(1);
        c.setNome("John");
        c.setCpf("09612582416");
        c.setRg("121323224");
        c.setEndereco(end);
                     
        
      //cc.deleteClient(c);
       cc.saveClient(c);
     //   cc.updateClient(c);
        //dao.save(c);
        //dao.update(c);
        //dao.delete(c);
       /*List<Cliente> l = cc.listAllClient();
        for (Cliente cl : l) {
            System.out.println(cl.getCod() + " | " + cl.getNome());

        } */

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

    }
}
