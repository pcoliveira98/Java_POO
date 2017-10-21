package br.edu.fatecfranca.exe1;
public class Veículo {
    public String tipo, cor;
    public int nroRodas, ano;
    public static String nomeDono;
    //metodos construtores
    public Veículo(){
        this.tipo = ""; 
        this.cor = "";
        this.nroRodas = 0; 
        this.ano = 0;
    }

    public Veículo(String tipo, String cor, int nroRodas, int ano) {
        this.tipo = tipo;
        this.cor = cor;
        this.nroRodas = nroRodas;
        this.ano = ano;  
    }
    // método de instância
    public void alteraTipo(String tipo){
        this.tipo = tipo;
    }
    // método de instância
    public String mostra(){
        return "Tipo "+this.tipo +"\n Cor: "+this.cor+
                "Nro. de rodas: "+this.nroRodas+
                "Ano: "+this.ano+ " nome do dono: "+Veículo.nomeDono;
    }
    //método de classe
    public static void alteraNome(String nome){
        Veículo.nomeDono = nome;
    }
    // método de classe
    public static String retornaNome(){
        return Veículo.nomeDono;
    }
    // método auxiliar de classe
    public static String parImpar(int nroRodas){
        return (nroRodas % 2 == 0) ? "Par":"Impar";
    }
    // método auxiliar de classe
    public static Veículo retornaNovoVeículo(Veículo v1, Veículo v2){
        Veículo novo = new Veículo();
        if(v1.ano >= v2.ano){
            novo.ano = v1.ano;
        }
        else novo.ano = v2.ano;
        novo.cor = v2.cor;
        novo.nroRodas = v1.nroRodas + v2.nroRodas;
        novo.tipo = v1.tipo;
        return novo;
    }
}
