package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        Filme obj1 = new Filme();
        obj1.setClassificacao("Livre");
        obj1.setCodigo(1);
        obj1.setTitulo("As aventuras de Peter Pan");
        
        Cliente obj2 = new Cliente();
        obj2.setCodigo(10);
        obj2.setNome("Felipe");
        obj2.setRg("24342");
        obj2.setFilme(obj1);
        JOptionPane.showMessageDialog(null,obj2.toString());
        
        Filme obj3 = new Filme(100,"007","12 anos");
        Cliente obj4 = new Cliente(44, "Marcelo","23212",obj3);
        
        JOptionPane.showMessageDialog(null, obj4.toString());
    }
    
}
