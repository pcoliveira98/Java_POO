package br.edu.fatecfranca.exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
   
    public Produto(){
        this.id = 0;
        this.qtde = 0;
        this.descricao = "";
        this.preco = 0;
    }
    
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public int comprar(int x){
        return this.qtde + x;
    }
    
    public int vender(int x){
        return this.qtde - x;
    }
    
    public float subir(float x){
        return this.preco + x ;
    }
    
    public float descer(float x){
        return this.preco - x;
    }
    
    public String mostra(){
        return "Número da id: " + this.id +
               "\n Quantidade: " + this.qtde +
               "\n Descrição: " + this.descricao +
               "\n Preço " + this.preco;
    }
    
}
