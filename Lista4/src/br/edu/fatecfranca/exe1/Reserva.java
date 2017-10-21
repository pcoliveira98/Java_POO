package br.edu.fatecfranca.exe1;
public class Reserva {
    private int codigo;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", voo=" + voo + '}';
    }
    
    
    
}
