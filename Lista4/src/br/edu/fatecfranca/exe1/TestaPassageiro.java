package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaPassageiro {
    public static void main(String[] args) {
        Voo v1 = new Voo("Manaus", "10");
        Voo v2 = new Voo("São Paulo", "11");
        
        Reserva r1 = new Reserva();
        r1.setVoo(v1);
        Reserva r2 = new Reserva();
        r2.setVoo(v2);
        
        Passageiro p1 = new Passageiro();
        p1.setNome("Fulano");
        p1.setReserva(123, v2);
        Passageiro p2 = new Passageiro();
        p2.setNome("Ciclano");
        p2.setReserva(321, v1);
        
        JOptionPane.showMessageDialog(null, p1.toString() + "\n" + p2.toString());
    }
    
}
