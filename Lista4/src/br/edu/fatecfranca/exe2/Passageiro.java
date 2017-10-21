package br.edu.fatecfranca.exe2;
public class Passageiro {
    private String nome, cpf;
    private int poltrona;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf, int poltrona) {
        this.nome = nome;
        this.cpf = cpf;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + ", poltrona=" + poltrona + '}';
    }
    
    
}
