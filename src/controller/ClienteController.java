package controller;

import dao.ClienteDAO;
import dao.GenericDAO;
import exception.CPFInvalidoException;
import exception.CPFJaCadastradoException;
import java.util.List;
import model.Cliente;
import util.Utils;

public class ClienteController {

    private final GenericDAO dao;
    private ClienteDAO cDao;
    private final String TABLE_NAME;

    public ClienteController() {
        dao = new GenericDAO();
        this.TABLE_NAME = "cliente";
    }

    public void saveClient(Cliente c) throws CPFInvalidoException, CPFJaCadastradoException {
        if (Utils.validaCpf(c.getCpf())) {
            //Cliente cAux = cDao.findByCpf(c.getCpf());
            //if (cAux == null) {
            //    throw new CPFJaCadastradoException("O CPF já está cadastrado.");
            //} else {
                dao.save(c);
           // }
        } else {
            throw new CPFInvalidoException("CPF inválido.");
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
