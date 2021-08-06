package exercicios.sequencial;

import javax.swing.JOptionPane;

public class Exercicio001 {
    public static void main(String[] args) throws Exception {
        int numero, antecessor, sucessor;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        antecessor = numero - 1;
        sucessor = numero + 1;

        JOptionPane.showMessageDialog(null, "Antecessor de " + numero + " é: " + antecessor + "\nSucessor de " + numero + " é: " + sucessor);
    }
}
