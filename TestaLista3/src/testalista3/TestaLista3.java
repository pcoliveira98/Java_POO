package testalista3;

import br.edu.fatecfranca.exe1.Cliente;
import javax.swing.JOptionPane;
        
public class TestaLista3 {
    public static void main(String[] args) {
       try{
           Cliente obj1 = new Cliente("876543-2", "3984-9", "Fulano", 0);
           obj1.depositar(3000);
           obj1.sacar(2000);
           JOptionPane.showMessageDialog(null, obj1.mostra());
           Cliente obj2 = new Cliente();
           obj2.setNome("Beltrano");
           obj2.setNroAgencia("9988-3");
           obj2.setNroConta("111111-1");
           obj2.depositar(4000);
           obj2.sacar(3500);
           JOptionPane.showMessageDialog(null, obj2.mostra());
           Cliente obj3 = new Cliente();
           obj3.setNroConta("33");
       }
       catch(IllegalArgumentException erro){
           JOptionPane.showMessageDialog(null, erro.getMessage());
       }
    }
}
