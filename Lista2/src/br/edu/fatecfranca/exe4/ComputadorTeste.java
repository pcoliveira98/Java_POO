package br.edu.fatecfranca.exe4;

import javax.swing.JOptionPane;

public class ComputadorTeste {
    public static void main(String[] args) {
               String proc;
        
        proc = JOptionPane.showInputDialog("Processador: ");
        Computador pc = new Computador(proc);
        
        Computador.ram = Integer.parseInt(JOptionPane.showInputDialog("Ram:"));
        
        int op = 0;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Alterar processador " + 
                    pc.processador +"\n" + "2-Adicionar ram[256MB]" + "\n" + "3-Alterar valor de ram " + Computador.ram 
                    +  "\n" + "4-Sair"));
        
            switch(op){
                case 1:
                    pc.alteraProcessador(JOptionPane.showInputDialog("P:"));
                    break;
                case 2:
                    Computador.upgradeMemoria();
                    break;
                case 3:
                    Computador.alteraRam(Integer.parseInt(JOptionPane.showInputDialog("Ram:")));
                    break;
                case 4:
                    op = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }while(op != 0);    
    }
    
}
