package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
        //cria objeto da classe Aluno
        Aluno obj1 = new Aluno();
        obj1.nome = JOptionPane.showInputDialog("Informe um nome");
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a p1"));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a p2"));
        obj1.notaFinal();
        //cria objeto da classe Aluno
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Informe a p1"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Informe a p2"));
        String e = JOptionPane.showInputDialog("Informe um nome");
        
        Aluno obj2 = new Aluno(a, b, c, d, e);
        obj2.notaFinal();
        
        JOptionPane.showMessageDialog(null, obj1.dadosAluno() + "Média de obj1" + obj1.notaFinal() + " " + obj1.passou());
        
        JOptionPane.showMessageDialog(null, obj2.dadosAluno() + "Média de obj2" + obj2.notaFinal() + " " + obj2.passou());
        
    } 
}