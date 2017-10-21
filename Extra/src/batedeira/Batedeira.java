package batedeira;
public class Batedeira {
    private int estadoBatedeira, velocidade;
    
    public Batedeira(){
        this.estadoBatedeira = 0;
        this.velocidade = 0;
    }

    public Batedeira(int estadoBatedeira, int velocidade) {
        this.trataEstadoBatedeira(estadoBatedeira);
        this.trataVelocidade(velocidade);
    }

    public int getEstadoBatedeira() {
        return this.estadoBatedeira;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setEstadoBatedeira(int estadoBatedeira) {
        this.trataEstadoBatedeira(estadoBatedeira);
    }
    
    private void trataEstadoBatedeira(int estadoBatedeira){
        if((estadoBatedeira == 0) || (estadoBatedeira == 1)){
            this.estadoBatedeira = estadoBatedeira;
        }
        else throw new IllegalArgumentException("Operação inválida");
    }
    
    public void setVelocidade(int velocidade) {
        this.trataVelocidade(velocidade);
    }
    
    private void trataVelocidade(int velocidade){
        if((velocidade == 5) || (velocidade == 10) || (velocidade == 15) || (velocidade == 20)){
            this.velocidade = velocidade;
        }
        else throw new IllegalArgumentException("Operação inválida");
    }
    
    public String desligaBatedeira(){
       return(this.estadoBatedeira == 1) ? "Ligado": "Desligado";
    }
    public void aumentaVelocidade(int x){
        this.velocidade = this.velocidade + x;
    }
    
    public static String menorVelocidade(Batedeira b1, Batedeira b2){
        String menor;
        if(b1.velocidade > b2.velocidade){
            menor = "Batedeira 2 é menor";
        }
        else if(b1.velocidade < b2.velocidade){
            menor = "Batedeira 1 é menor";
        }
        else throw new IllegalArgumentException("Ambas estão na mesma velocidade");
        
        return menor;
    }
    
    public String mostra(){
        return "Velocidade: " + this.velocidade;
    }
}
