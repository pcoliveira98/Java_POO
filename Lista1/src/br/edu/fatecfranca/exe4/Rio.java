package br.edu.fatecfranca.exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(){
        this.nome = "";
        this.nivel = 0;
        this.poluido = false;
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public float chover(float x){
        return this.nivel + x;
    }
    
    public float ensolarar(float x){
        return this.nivel - x;
    }
    
    public void limpar(){
        this.poluido = false;
    }
    
    public void sujar(){
        this.poluido = true;
    }
    
    public String mostra(){
        return "Nome: " + this.nome +
               "\n Nível do rio: " + this.nivel +
               "\n Poluição: " + (this.poluido ? "Sim":"Não");
    }
    
}
