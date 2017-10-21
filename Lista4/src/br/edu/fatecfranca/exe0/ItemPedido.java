package br.edu.fatecfranca.exe0;
public class ItemPedido {
    private int codigo, qtde;
    private float valor;

    public ItemPedido() {
    }

    public ItemPedido(int codigo, int qtde, float valor) {
        this.codigo = codigo;
        this.qtde = qtde;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtde() {
        return qtde;
    }

    public float getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "codigo=" + codigo + ", qtde=" + qtde + ", valor=" + valor + '}';
    }
    
}
