package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author jesp
 */
public class TesteMain extends Application {

    public static void main(String[] args) {
        launch(args);
        /*GenericDAO dao = new GenericDAO();
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente();

        // c.setCod(3);
        c.setNome("Joaquim");
        c.setCpf("12343");
        c.setRg("12124");

        //cc.saveClient(c);
        //dao.save(c);
        //dao.update(c);
        //dao.delete(c);
        List<Cliente> l = dao.listAll("cliente");
        for (Cliente cl : l) {
            System.out.println(cl.getCod() + " | " + cl.getNome());

        } */

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

    }
}
