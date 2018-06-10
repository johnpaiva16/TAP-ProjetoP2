package controller;

import dao.GenericDAO;
import java.util.List;
import model.Cliente;
import util.Utils;

public class ClienteController {

    private GenericDAO dao = new GenericDAO();
    private final String TABLE_NAME = "cliente";

    public void saveClient(Cliente c) {
        if (Utils.validaCpf(c.getCpf())) {
            dao.save(c);
        }
    }

    public void updateClient(Cliente c) {
        if (Utils.validaCpf(c.getCpf())) {
            dao.update(c);
        }
    }

    public List<Cliente> listAllClient() {
        return (List<Cliente>) dao.listAll(TABLE_NAME);
    }

    public void deleteClient(Cliente c) {
        dao.delete(c);
    }
}
