package br.edu.fatecfranca.exe3;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Topico> topicos;
    
    public Disciplina() {
        this.topicos = new ArrayList();
    }

    public Disciplina(String codigo, ArrayList<Topico> topicos) {
        this.codigo = codigo;
        this.topicos = topicos;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTopicos(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }

    @Override
    public String toString() {
        String saida = "Disciplina{" + "codigo=" + codigo + ", topicos=";
        for(Topico topico: this.topicos){
            saida = saida + topico.toString() + "\n";
        }
        return saida;
    }
    
    public void associaTopico(Topico topico){
        this.topicos.add(topico);
    }
    
    public boolean desvincularTopico(Topico topico){
         return this.topicos.remove(topico);
     }
    
    public boolean obterTopico(Topico topico){
         return this.topicos.contains(topico);
     }
    
    public boolean obterTopico(String cpf){
        for(Topico topico: this.topicos){
            if(topico.getCpf().equals(cpf)){
                  return true;
              }
        }
        return false;
    }
    
    private int obterPosicaoTopico(Topico topico){
          return this.topicos.indexOf(topico);
      }
    
     private int obterPosicaoTopico(String cpf){
          for(Topico topico: this.topicos){
              if(topico.getCpf().equals(cpf)){
                  return this.topicos.indexOf(topico);
              }
          }
          return -1;
      }
     
     public boolean atualizaTopico(Topico topico){
          int pos = obterPosicaoTopico(topico.getCpf());
          if(pos != -1){
            this.topicos.set(pos,topico);
            return true;
          }
          else return false;
      }
}
