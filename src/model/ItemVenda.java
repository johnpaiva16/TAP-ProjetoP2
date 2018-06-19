
package model;

/**
 *
 * @author jesp
 */

public class ItemVenda {
 
    private int cod;
    private Produto produto;
    private int qtd;

    public ItemVenda(){
    
    }
    
    public ItemVenda(Produto p, int qtd){
        this.produto = p;
        this.qtd = qtd;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
}
