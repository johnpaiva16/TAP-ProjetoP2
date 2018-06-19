package controller;

import dao.ClienteDAO;
import dao.GenericDAO;
import java.util.List;
import model.Cliente;
import util.Utils;

public class ClienteController {

    private final GenericDAO dao;
    private final String TABLE_NAME;

    public ClienteController() {
        dao= new GenericDAO();
        this.TABLE_NAME = "cliente";
    }

    public void saveClient(Cliente c) {
        if (Utils.validaCpf(c.getCpf())) {
            dao.save(c);
        }
    }

    public Cliente updateClient(Cliente c) {
        if (c.getCod() != 0 && c.getEndereco().getCod() != 0) {
            return (Cliente) dao.update(c);
        }
        return null;
    }

    public List<Cliente> findAllClients() {
        return dao.findAll(TABLE_NAME);
    }

    public Cliente findClientByCod(int id) {
        return (Cliente) dao.findByCod(id, TABLE_NAME);

    }
    public Cliente findClientByCpf(String cpf) {
        ClienteDAO cDao = new ClienteDAO();
        return cDao.findByCpf(cpf);

    }

    public void deleteClient(int id) {
        Cliente c = findClientByCod(id);
        dao.delete(c);
    }
}
