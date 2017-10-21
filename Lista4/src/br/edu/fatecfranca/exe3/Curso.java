package br.edu.fatecfranca.exe3;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList();
    }

    public Curso(String nome, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        String saida = "Curso{" + "nome=" + nome + "}" + "\n";
        for(Disciplina disciplina: this.disciplinas){
            saida = saida + disciplina.toString() + "\n";
        }
        return saida;
    }
    
    public void associaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
    public boolean associaTopicoDisciplina(Disciplina disciplina, Topico topico){
        if(this.disciplinas.contains(disciplina)){
            disciplina.associaTopico(topico);
            return true;
        }
        return false;
    }
    
    public boolean desvinculaDisciplina(Disciplina disciplina){
        return this.disciplinas.remove(disciplina);
    }
    
    public boolean desvinculaTopicoDisciplina(Disciplina disciplina, Topico topico){
        if(this.disciplinas.contains(disciplina)){
            disciplina.desvincularTopico(topico);
            return true;
        }
        return false;
    }
    
    public boolean obterDisciplina(Disciplina disciplina){
        return this.disciplinas.contains(disciplina);
    }
    
    public boolean obterTopicoDisciplina(Disciplina disciplina, Topico topico){
        if(this.disciplinas.contains(disciplina)){
            return disciplina.obterTopico(topico);
        }
        return false;
    }
    
    public boolean obterDisciplina(String numero){
        for(Disciplina disciplina: this.disciplinas){
            if(disciplina.getCodigo().equals(numero)){
                return true;
            }
        }
        return false;
    }
    private int obterPosicaoDisciplina(Disciplina disciplina){
        return this.disciplinas.indexOf(disciplina);
    }
    
    private int obterPosicaoDisciplina(int numero){
        for(Disciplina disciplina: this.disciplinas){
            if(disciplina.getCodigo().equals(numero)){
                return this.disciplinas.indexOf(disciplina);
            }
        }
        return -1;
    }
    
    public boolean atualizaDisciplina(Disciplina atual, Disciplina novo){
        int pos = this.obterPosicaoDisciplina(atual);
        if(pos != -1){
            this.disciplinas.set(pos,novo);
            return true;
        }
        else return false;
    }
    
    public boolean atualizaTopicoDisciplina(Disciplina disciplina, Topico topico){
        if(this.disciplinas.contains(disciplina)){
            return disciplina.atualizaTopico(topico);
        }
        return false;
    }
}
