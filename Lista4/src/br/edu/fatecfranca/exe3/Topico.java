package br.edu.fatecfranca.exe3;
public class Topico {
    private String assunto, cpf;

    public Topico() {
    }

    public Topico(String assunto, String cpf) {
        this.assunto = assunto;
        this.cpf = cpf;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Topico{" + "assunto=" + assunto + ", cpf=" + cpf + '}';
    }
    
    
}
