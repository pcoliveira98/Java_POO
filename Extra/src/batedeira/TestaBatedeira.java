package batedeira;

import javax.swing.JOptionPane;

public class TestaBatedeira {
    public static void main(String[] args) {
         try{
           Batedeira obj1 = new Batedeira(1, 15);
           obj1.aumentaVelocidade(10);
           JOptionPane.showMessageDialog(null, obj1.desligaBatedeira() + "\n" +  obj1.mostra());
           Batedeira obj2 = new Batedeira();
           obj2.setEstadoBatedeira(1);
           obj2.setVelocidade(10);
           obj2.aumentaVelocidade(5);
           JOptionPane.showMessageDialog(null, obj2.desligaBatedeira() + "\n" +  obj2.mostra());
           String aux = Batedeira.menorVelocidade(obj1, obj2);
           JOptionPane.showMessageDialog(null, aux);
       }
       catch(IllegalArgumentException erro){
           JOptionPane.showMessageDialog(null, erro.getMessage());
       }
    }
}
