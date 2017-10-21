package br.edu.fatecfranca.exe4;
public class Computador {
    public String processador;
    public static int ram;

    public Computador(){
        this.processador = "";
    }
    
    public Computador(String processador) {
        this.processador = processador;
    }
    
    public void alteraProcessador(String processador){
        this.processador = processador;
    }
    
    public static void alteraRam(int ram){
        Computador.ram = ram;
    }
    
    public static void upgradeMemoria(){
        ram+=256;
    }
    
}
