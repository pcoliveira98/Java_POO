package br.edu.fatecfranca.exe1;
public class Passageiro {
    private String nome;
    private Reserva reserva;

    public Passageiro() {
    }

    public Passageiro(String nome, int cReserva, Voo rVoo) {
        this.nome = nome;
        this.reserva = new Reserva(cReserva,rVoo);
    }

    public String getNome() {
        return nome;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setReserva(int cReserva, Voo rVoo) {
        this.reserva = new Reserva(cReserva,rVoo);
    }    

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", reserva=" + reserva.toString() + '}';
    }
    
    
}
