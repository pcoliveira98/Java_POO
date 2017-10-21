package br.edu.fatecfranca.exe3;
public class MeuString {
    public static void main(String args[]){
    
        String str1 = "meu primeiro string";
        // método de instância
        int comprimento = str1.length();
        // método de instância
        char caracter = str1.charAt(comprimento);

        // método de classe
        String str2 = String.valueOf(comprimento);
    }
    
}
