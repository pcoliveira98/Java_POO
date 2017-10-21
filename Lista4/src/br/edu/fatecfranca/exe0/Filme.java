package br.edu.fatecfranca.exe0;
public class Filme {
    private int codigo;
    private String titulo, classificacao;

    public Filme() {
    }

    public Filme(int codigo, String titulo, String classificacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.classificacao = classificacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Filme{" + "codigo=" + codigo + ", titulo=" + titulo + ", classificacao=" + classificacao + '}';
    }
    
}
