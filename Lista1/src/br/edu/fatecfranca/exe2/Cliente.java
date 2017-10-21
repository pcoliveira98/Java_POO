package br.edu.fatecfranca.exe2;
public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente(){
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0;
    }
    
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public float realizarDeposito(float x){
        return this.saldo + x;
    }
    
    public float realizarSaque(float x){
        return this.saldo - x;
    }
    
    public String dadosCliente(){
        return "Número da conta: " + this.numeroConta +
               "\n Nome: " + this.nome +
               "\n Saldo atual: " + this.saldo;
    }
    
}
