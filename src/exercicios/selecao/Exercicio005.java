package exercicios.selecao;

import javax.swing.JOptionPane;

public class Exercicio005 {
    public static void main(String[] args) throws Exception {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "categoria: infantil A");
        } else if (idade <= 10) {
            JOptionPane.showMessageDialog(null, "categoria: infantil B");
        } else if (idade <= 13) {
            JOptionPane.showMessageDialog(null, "categoria: juvenil A");
        } else if (idade <= 17) {
            JOptionPane.showMessageDialog(null, "categoria: juvenil B");
        } else {
            JOptionPane.showMessageDialog(null, "categoria: adulto");
        }

    }
}
