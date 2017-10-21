package br.edu.fatecfranca.exe1;
public class Voo {
    private String destino, numero;

    public Voo() {
    }

    public Voo(String destino, String numero) {
        this.destino = destino;
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Voo{" + "destino=" + destino + ", numero=" + numero + '}';
    }
    
}
