package exercicios.repeticao;

import javax.swing.JOptionPane;

public class Exercicio004 {
    public static void main(String[] main) throws Exception {
        int codigo, controle = 1; 
        double preco, maiorPreco, soma;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto: "));
        preco = Integer.parseInt(JOptionPane.showInputDialog("Preço do produto: "));

        maiorPreco = preco;
        soma = preco;

        while (controle <= 14) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto: "));
            preco = Integer.parseInt(JOptionPane.showInputDialog("Preço do produto: "));

            soma = soma + preco;

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            controle++;
        }
        JOptionPane.showMessageDialog(null, "O maior preço lido foi: " + maiorPreco);
        JOptionPane.showMessageDialog(null, "A média dos preços foi: " + soma / 15);
    }
}