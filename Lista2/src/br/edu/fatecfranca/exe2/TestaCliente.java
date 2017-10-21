package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.numeroConta = "255";
        fulano.nome = "Fulano";
        fulano.numeroAgencia = "123456";
        Cliente.saldo = 7277;
        fulano.realizarDeposito((float)5577.13);
        fulano.realizarSaque((float)877.24);
               
        Cliente beltrano = new Cliente("0569", "0001014632", "Beltrano");
        Cliente.saldo = (float) 3662.90;
        
        beltrano.realizarDeposito((float)2456.00);
        beltrano.realizarSaque((float)100.55);
        
        Cliente novo = Cliente.retornaNovoCliente(fulano, beltrano);
        
        JOptionPane.showMessageDialog(null,fulano.mostra() + "\n Valor pós saque: " + fulano.realizarSaque((float)877.24)
                + "\n Valor pós depósito: " + fulano.realizarDeposito((float)5577.13) +"\n" + fulano.verificaTamanho());
        JOptionPane.showMessageDialog(null,beltrano.mostra() + "\n Valor pós saque: " + beltrano.realizarSaque((float)100.55)
                + "\n Valor pós depósito: " + beltrano.realizarDeposito((float)2456.00) +"\n" + beltrano.verificaTamanho());
        JOptionPane.showMessageDialog(null,novo.mostra() + "\n Valor pós saque: " + novo.realizarSaque((float)5433.23)
                + "\n Valor pós depósito: " + novo.realizarDeposito((float)2004.55) +"\n" + novo.verificaTamanho());
    }
    
}
