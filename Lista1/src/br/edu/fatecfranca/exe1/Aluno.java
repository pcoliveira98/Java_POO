package br.edu.fatecfranca.exe1;
public class Aluno {
    //declaração das variáveis
    public int numeroAluno, idade;
    public float p1, p2;
    public String nome;
    
    //criação dos métodos construtores
    //sem parâmetros = valores default
    public Aluno(){
        this.idade = 0;
        this.numeroAluno = 0;
        this.p1 = 0;
        this.p2 = 0;
        this.nome = "";
    }
    //com parâmetros
    public Aluno(int idade, int numeroAluno, float p1, float p2, String nome){
        this.idade = idade;
        this.numeroAluno = numeroAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }
    
    //criação dos métodos da classe
    public float notaFinal() {
        return (this.p1 + this.p2)/2;
    }
    public String passou(){
        //operador ternário
        return(this.notaFinal() >= 6) ? "Passou": "Não Passou";
    }
    public String dadosAluno(){
        return "Número: " + this.numeroAluno +
               "\n Nome: " + this.nome +
               "\n P1: " + this.p1 +
               "\n P2 " + this.p2;
    }
}
       
    

