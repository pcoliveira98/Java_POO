package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente Fulano = new Cliente();
        Fulano.nome = JOptionPane.showInputDialog("Informe o nome");
        Fulano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
        Fulano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência"));
        Fulano.saldo = (float) 2000.23;
        Fulano.realizarDeposito(2000);
        Fulano.realizarSaque(500);
        
        String c = JOptionPane.showInputDialog("Informe o nome");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência")); 
        float d = (float) 3458.56;
        
        
        Cliente Beltrano = new Cliente(a, b, c, d);
        Beltrano.realizarDeposito(400);
        Beltrano.realizarSaque(2000);
        
        JOptionPane.showMessageDialog(null, Fulano.dadosCliente() + "       " + "Valor pós-depósito " + Fulano.realizarDeposito(2000) + "       " + "Valor pós saque" + Fulano.realizarSaque(500));
        
        JOptionPane.showMessageDialog(null, Beltrano.dadosCliente()+ "      " + "Valor pós-depósito " + Beltrano.realizarDeposito(400) + "      " + "Valor pós saque" + Beltrano.realizarSaque(2000));
    }
    
}
