package controller;

import dao.EstoqueDAO;
import dao.GenericDAO;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityExistsException;
import model.Cliente;
import model.Venda;

/**
 *
 * @author jesp
 */
public class VendaController {

    private final String TABLE_NAME = "venda";
    private final GenericDAO dao = new GenericDAO();
    private final EstoqueController ec = new EstoqueController();

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
                ec.subtraiQtdVendida(venda.getItens());
                return venda;
            }
        }
        return null;
    }

    public List<Venda> findAllVendas() throws SQLException {
        return dao.findAll(TABLE_NAME);
    }

    public Venda findVendaByCod(int cod) throws SQLException {
        return (Venda) dao.findByCod(cod, TABLE_NAME);
    }
    
}
