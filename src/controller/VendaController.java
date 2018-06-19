package controller;

import dao.GenericDAO;
import model.Cliente;
import model.Venda;

/**
 *
 * @author jesp
 */
public class VendaController {

    private final GenericDAO dao = new GenericDAO();

    public Venda finalizaVenda(Venda venda) {
        if (!venda.getItens().isEmpty()) {
            ClienteController cc = new ClienteController();
            Cliente c = null;
            if (venda.getCliente().getCod() != 0) {
                c = cc.findClientByCod(venda.getCliente().getCod());
            }
            if (c != null) {
                venda.setCliente(c);
            }
            venda = (Venda) dao.save(venda);
            if (venda.getCod() != 0) {
                return venda;
            }
        }
        return null;
    }
}
