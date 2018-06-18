package view;

import com.sun.xml.internal.ws.util.StringUtils;
import controller.ClienteController;
import controller.FornecedorController;
import controller.ProdutoController;
import controller.VendaController;

import dao.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;
import model.ItemVenda;
import model.Produto;
import model.Venda;

/**
 *
 * @author jesp
 */
public class TesteMain  {

   /* public static void main(String[] args) {
       
        ProdutoController pc = new ProdutoController();
        VendaController vc = new VendaController();
       
        Produto p = pc.findProdutoByCod(71);
        Produto p2 = pc.findProdutoByCod(72);
               
        ItemVenda item = new ItemVenda();
        item.setProduto(p);
        item.setQtd(3);
       
        ItemVenda item2 = new ItemVenda();
        item2.setProduto(p2);
        item2.setQtd(2);
        
        
        Venda v = new Venda();
       v.adicionaItem(item);
       v.adicionaItem(item2);
        for(ItemVenda i : v.getItens()){
            System.out.println(i.getProduto().getDescricao());
        }
            
       
        //System.out.println("AQUI");
        vc.finalizaVenda(v);

    }*/

    
}
