package br.edu.fatecfranca.exe0;
public class Data {
    private int dia, mes, ano;
    
    public Data(){
        this.dia =1;
        this.mes = 1;
        this.ano = 2017;
    }
    
    public Data(int dia, int mes, int ano){
        this.trataDia(dia);
        this.trataMes(mes);
        this.trataAno(ano);
    }

    public void trataDia(int dia) {
        if((dia >= 1)&&(dia <= 31)){
            this.dia = dia;
        }
        else throw new IllegalArgumentException("Dia inválido");
    }
    public void setDia(int dia){
        this.trataDia(dia);
    }

    public void trataMes(int mes) {
        if((mes >= 1) && (mes <= 12)){
            this.mes = mes;
        }
        else throw new IllegalArgumentException("Mês inválido");
    }
    
    public void setMes(int mes){
        this.trataMes(mes);
    }

    public void trataAno(int ano) {
        if(ano >= 0){
            this.ano = ano;
        }
        else throw new IllegalArgumentException("Ano inválido");
    }

    public void setAno(int ano){
        this.trataAno(ano);
    }
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }
    
    
    
}
