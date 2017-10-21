package br.edu.fatecfranca.exe0;

import java.util.Date;

public class Pedido {
    private int codigo;
    private Date data;
    private float valorTotal;
    //associação
    private ItemPedido itemPedido;

    public Pedido() {
    }

    public Pedido(int codigo, Date data, float valorTotal, int cPedido, float vPedido, int qPedido) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotal = valorTotal;
        //composição
        this.itemPedido = new ItemPedido(cPedido,qPedido,vPedido);
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setItemPedido( int cPedido, float vPedido, int qPedido) {
        this.itemPedido = new ItemPedido(cPedido, qPedido, vPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + ", valorTotal=" + valorTotal + ", itemPedido=" + itemPedido.toString() + '}';
    }
    
    
}
