package br.edu.fatecfranca.exe2;

import java.util.ArrayList;

public class Rodoviaria {
    private String cidade,nome;
    private ArrayList<Onibus> onibus;
    
    public Rodoviaria(){
        this.onibus = new ArrayList();
    }

    public Rodoviaria(String cidade, String nome, ArrayList<Onibus> onibus) {
        this.cidade = cidade;
        this.nome = nome;
        this.onibus = onibus;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        String saida = "Rodoviaria{" + "cidade=" + cidade + ", nome=" + nome;
        for(Onibus on: this.onibus){
            saida = saida + on.toString() + "\n";
        }
        return saida;
    }
    
    public void associaOnibus(Onibus onibus){
        this.onibus.add(onibus);
    }
    
    public boolean associaPassageiroOnibus(Onibus on, Passageiro pas){
        if(this.onibus.contains(on)){
            on.associaPassageiro(pas);
            return true;
        }
        return false;
    }
    
    public boolean desvinculaOnibus(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    
    public boolean desvinculaPassageiroOnibus(Passageiro pas, Onibus on){
        if(this.onibus.contains(on)){
            on.desvincularPassageiro(pas);
            return true;
        }
        return false;
    }
    
    public boolean obterOnibus(Onibus onibus){
        return this.onibus.contains(onibus);
    }
    
    public boolean obterPassageiroOnibus(Onibus on, Passageiro pas){
        if(this.onibus.contains(on)){
            return on.obterPassageiro(pas);
        }
        return false;
    }
    
    public boolean obterOnibus(String numero){
        for(Onibus on: this.onibus){
            if(on.getNumero().equals(numero)){
                return true;
            }
        }
        return false;
    }
    private int obterPosicaoOnibus(Onibus onibus){
        return this.onibus.indexOf(onibus);
    }
    
    private int obterPosicaoOnibus(int numero){
        for(Onibus on: this.onibus){
            if(on.getNumero().equals(numero)){
                return this.onibus.indexOf(on);
            }
        }
        return -1;
    }
    
    public boolean atualizaOnibus(Onibus atual, Onibus novo){
        int pos = this.obterPosicaoOnibus(atual);
        if(pos != -1){
            this.onibus.set(pos,novo);
            return true;
        }
        else return false;
    }
    
    public boolean atualizaPassageiroOnibus(Onibus on, Passageiro passageiro){
        if(this.onibus.contains(on)){
            return on.atualizaPassageiro(passageiro);
        }
        return false;
    }
}
