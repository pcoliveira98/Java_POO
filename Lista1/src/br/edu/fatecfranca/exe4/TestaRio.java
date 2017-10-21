package br.edu.fatecfranca.exe4;

import javax.swing.JOptionPane;

public class TestaRio {
    public static void main(String[] args) {
       Rio rio1 = new Rio();
       rio1.nome = JOptionPane.showInputDialog("Informe o nome do rio");
       rio1.nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível do rio"));
       rio1.poluido = false;
       
       rio1.chover(10000);
       rio1.sujar();
       JOptionPane.showMessageDialog(null, rio1.mostra());
       
       

       String a = JOptionPane.showInputDialog("Informe o nome do rio");
       float b = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível do rio"));
       boolean c;
       int resp = JOptionPane.showConfirmDialog(null,"O rio está poluído?", "Escolha",JOptionPane.YES_NO_OPTION);
       c = resp == 0;//resp == 0(YES) resp == 1 (FALSE)
      
       Rio rio2 = new Rio(a, b, c);
       rio2.ensolarar(12000);
       rio2.limpar();
       JOptionPane.showMessageDialog(null, rio2.mostra());
    }
    
}
