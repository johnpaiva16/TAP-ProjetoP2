package controller;

import dao.GenericDAO;
import java.sql.SQLException;
import javax.persistence.EntityExistsException;
import model.Cliente;
import model.Venda;

/**
 *
 * @author jesp
 */
public class VendaController {

    private final GenericDAO dao = new GenericDAO();

    public Venda finalizaVenda(Venda venda) throws EntityExistsException, SQLException {
        if (!venda.getItens().isEmpty()) {
            ClienteController cc = new ClienteController();
            Cliente c = new Cliente();

            if (venda.getCliente().getCod() != 0) {
                c = cc.findClientByCod(venda.getCliente().getCod());
            }
            venda.setCliente(c);
            venda = (Venda) dao.save(venda);
            if (venda.getCod() != 0) {
                return venda;
            }
        }
        return null;
    }
}
