package controller;

import dao.ClienteDAO;
import dao.GenericDAO;
import exception.CPFInvalidoException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityExistsException;
import model.Cliente;
import org.hibernate.exception.ConstraintViolationException;
import util.Utils;

public class ClienteController {

    private final GenericDAO dao;
    private ClienteDAO cDao;
    private final String TABLE_NAME;

    public ClienteController() {
        dao = new GenericDAO();
        cDao = new ClienteDAO();
        this.TABLE_NAME = "cliente";
    }

    public void saveClient(Cliente c) throws CPFInvalidoException,EntityExistsException, SQLException  {
        if (Utils.validaCpf(c.getCpf())) {
            dao.save(c);
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

    public List<Cliente> findAllClients() throws SQLException {
        return dao.findAll(TABLE_NAME);
    }

    public Cliente findClientByCod(int id) throws SQLException {
        return (Cliente) dao.findByCod(id, TABLE_NAME);

    }

    public Cliente findClientByCpf(String cpf) throws SQLException {
        ClienteDAO cDao = new ClienteDAO();
        return cDao.findByCpf(cpf);

    }

    public void deleteClient(int id) throws SQLException {
        Cliente c = findClientByCod(id);
        dao.delete(c);
    }
}
