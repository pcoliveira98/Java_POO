package br.edu.fatecfranca.exe2;
public class Cliente {

    public String numeroConta, numeroAgencia, nome;
    public static float saldo;
    
    public Cliente() {
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }
    
    public float realizarDeposito(float x){
        return Cliente.saldo + x;
    }
    
    public float realizarSaque(float x){
        return Cliente.saldo - x;
    }
    
    public String mostra(){
        return "Número da conta: " + this.numeroConta +
                "\n Número da Agência: " + this.numeroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo atual: " + Cliente.saldo;
    }
    
    public static void alteraSaldo(float saldo){
        Cliente.saldo = saldo;
    }
    
    public static float retornaSaldo(){
        return Cliente.saldo;
    }
    
    public void alteraAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    
    public String retornaAgencia(){
        return this.numeroAgencia;
    }
    
     public static Cliente retornaNovoCliente(Cliente c1, Cliente c2){
        Cliente c3 = new Cliente();
        c3.saldo = c1.saldo + c2.saldo;
        c3.numeroAgencia = c1.numeroAgencia;
        c3.numeroConta = c2.numeroConta;
        c3.nome = "Fulano";
        return c3;
    }
     
     public String verificaTamanho(){
        return (numeroAgencia.length() == 6)? "Exatamente 6 números" : "Não há 6 números";
     }
}
