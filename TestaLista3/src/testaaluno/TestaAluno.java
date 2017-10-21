package testaaluno;

import br.edu.fatecfranca.exe2.Aluno;
import javax.swing.JOptionPane;
public class TestaAluno {

    public static void main(String[] args) {
         try{
           Aluno obj1 = new Aluno("123456", "Fulano", 19, 10, 8);
           obj1.notaFinal();
           JOptionPane.showMessageDialog(null, obj1.dadosAluno() + "\nMédia Final: " + obj1.notaFinal() + "\n" + obj1.passou());
           Aluno obj2 = new Aluno();
           obj2.setNome("Beltrano");
           obj2.setNroAluno("998823");
           obj2.setIdade(18);
           obj2.setP1((float) 6.5);
           obj2.setP2(3);
           JOptionPane.showMessageDialog(null, obj2.dadosAluno() + "\nMédia Final: " + obj2.notaFinal() + "\n" + obj2.passou());
           Aluno obj3 = new Aluno();
           obj3.setNroAluno("33");
       }
       catch(IllegalArgumentException erro){
           JOptionPane.showMessageDialog(null, erro.getMessage());
       }
    }
}
