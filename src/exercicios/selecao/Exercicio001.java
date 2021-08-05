package exercicios.selecao;
import javax.swing.JOptionPane;

public class Exercicio001 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        if(numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os numeros são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os numeros são diferentes");
        }
    }
}
