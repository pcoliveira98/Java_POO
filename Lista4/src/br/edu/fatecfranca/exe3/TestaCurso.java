package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

public class TestaCurso {
    public static void main(String[] args) {
        Topico t1 = new Topico("Java","1");
        Topico t2 = new Topico("Javascript","2");
        Topico t3 = new Topico("Cobol","3");
        Topico t4 = new Topico("Python","4");
        
        Disciplina d1 = new Disciplina();
        d1.setCodigo("271");
        d1.associaTopico(t1);
        d1.associaTopico(t2);
        
        Disciplina d2 = new Disciplina();
        d2.setCodigo("435");
        d2.associaTopico(t3);
        d2.associaTopico(t4);
        
        Curso c1 = new Curso();
        c1.setNome("ADS");
        c1.associaDisciplina(d1);
        c1.associaDisciplina(d2);
        JOptionPane.showMessageDialog(null, c1.toString());
        
         c1.desvinculaTopicoDisciplina(d2,t3);
        
        JOptionPane.showMessageDialog(null, c1.toString());
    }
    
}
