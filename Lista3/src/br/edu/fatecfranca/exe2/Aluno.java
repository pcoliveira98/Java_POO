package br.edu.fatecfranca.exe2;
public class Aluno {
    private String nroAluno, nome;
    private int idade;
    private float p1, p2;
    
    public Aluno(){
        this.nroAluno = "000000";
        this.nome = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(String nroAluno, String nome, int idade, float p1, float p2) {
        this.trataNroAluno(nroAluno);
        this.trataNome(nome);
        this.trataIdade(idade);
        this.trataP1(p1);
        this.trataP2(p2);
    }

    public String getNroAluno() {
        return this.nroAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }
    
    public void setNroAluno(String nroAluno) {
        this.trataNroAluno(nroAluno);
    }

    private void trataNroAluno(String nroAluno){
        if(nroAluno.length() == 6){
            this.nroAluno = nroAluno;
        }
        else throw new IllegalArgumentException("Número do aluno inválido");
    }
    
    public void setNome(String nome) {
        this.trataNome(nome);
    }
    
    private void trataNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome do aluno inválido");
    }

    public void setIdade(int idade) {
        this.trataIdade(idade);
    }
    
    private void trataIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }
        else throw new IllegalArgumentException("Idade do aluno inválida!");
    }

    public void setP1(float p1) {
        trataP1(p1);
    }
    
     private void trataP1(float p1){
        if(p1 >= 0){
            this.p1 = p1;
        }
        else throw new IllegalArgumentException("Nota da p1 inválida!");
    }

    public void setP2(float p2) {
        trataP2(p2);
    }
    
    private void trataP2(float p2){
        if(p2 >= 0){
            this.p2 = p2;
        }
        else throw new IllegalArgumentException("Nota da p2 inválida!");
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String passou(){
        return(this.notaFinal() >= 6) ? "Passou": "Não Passou";
    }
    
     public String dadosAluno(){
        return "Número do aluno: " + this.nroAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade;
    }

}
