package controller;

import dao.GenericDAO;
import model.Venda;

/**
 *
 * @author jesp
 */
public class VendaController {

    private final GenericDAO dao = new GenericDAO();

    public String finalizaVenda(Venda venda) {
        if (!venda.getItens().isEmpty()) {
            dao.save(venda);
        }
        return null;
    }
}
