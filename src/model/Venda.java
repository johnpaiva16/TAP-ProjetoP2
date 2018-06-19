package model;

import java.sql.RowId;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesp
 */
public class Venda {

    private int cod;
    private List<ItemVenda> itens;
    private double subtotal;
    private double desconto;
    private double valorTotal;
    private String data;
    private Cliente cliente;

    public Venda() {
        itens = new ArrayList<ItemVenda>();
        desconto = 0;
        subtotal = 0;
        valorTotal = 0;
    }

    public void adicionaItem(ItemVenda item) {
        itens.add(item);
        calculaSubtotal();
        calculaTotal();
    }
    
    public void removeItem(int index) {
        itens.remove(index);
        calculaSubtotal();
        calculaTotal();
    }

    private void calculaSubtotal() {
        double subtotal = 0;
        for (ItemVenda i : itens) {
            subtotal += i.getProduto().getPreco() * i.getQtd();
        }
        this.subtotal = subtotal;
    }

    private void calculaTotal() {
        valorTotal = subtotal - desconto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    
    
}