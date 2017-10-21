package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaVeículo {
    public static void main(String[] args) {
       Veículo obj1 = new Veículo();
       obj1.ano = 2017;
       obj1.cor = "Branca";
       obj1.nroRodas = 2;
       obj1.tipo = "Moto";
       Veículo.nomeDono = "Coutinho";
       JOptionPane.showMessageDialog(null, obj1.mostra());
       Veículo obj2 = new Veículo("Carro", "Preto", 4, 2016);
       Veículo.nomeDono = "Paulinho";
       JOptionPane.showMessageDialog(null, obj2.mostra());
       
       Veículo obj3 = Veículo.retornaNovoVeículo(obj1,obj2);
       JOptionPane.showMessageDialog(null, obj3.mostra());
       
       String aux = Veículo.parImpar(obj2.nroRodas);
    }
    
}
