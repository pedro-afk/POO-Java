package exercicios.repeticao;

import javax.swing.JOptionPane;

public class Exercicio006 {
    public static void main(String[] args) throws Exception {
        int fat, n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para calcular seu fatorial: "));
        for(fat = 1; n > 1; n--) {
            fat = fat * n;
        }
        JOptionPane.showMessageDialog(null, "Fatorial: " + fat);
    }
}
