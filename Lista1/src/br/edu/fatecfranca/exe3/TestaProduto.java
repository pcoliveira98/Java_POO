package br.edu.fatecfranca.exe3;
import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        
        Produto prod1 = new Produto();
        prod1.id = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da id"));
        prod1.descricao = JOptionPane.showInputDialog("Informe a descrição");
        prod1.qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
        prod1.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço"));
        prod1.comprar(50);
        prod1.subir((float) 0.6);
        
        JOptionPane.showMessageDialog(null, prod1.mostra()+ "    "+ "Estoque atual: " +prod1.comprar(50) + "    "+"Preço atual: "+prod1.subir((float) 0.6));
     
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da id"));
        String b = JOptionPane.showInputDialog("Informe a descrição");
        int c = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade")); 
        float d = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço"));
        
        
        Produto prod2 = new Produto(a, b, c, d);
        prod2.vender(45);
        prod2.descer((float) 0.5);
        
        
        JOptionPane.showMessageDialog(null, prod2.mostra()+ "    "+ "Estoque atual: " +prod2.comprar(45) + "    "+"Preço atual: "+prod1.subir((float) 0.5));
        
    }
    
}
