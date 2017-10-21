package br.edu.fatecfranca.exe0;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPedido {

    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.setCodigo(100);
        p.setData(new Date());
        p.setValorTotal(300);
        p.setItemPedido(400,3,40);
        JOptionPane.showMessageDialog(null, p.toString());
    }
    
}
