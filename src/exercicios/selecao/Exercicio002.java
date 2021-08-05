package exercicios.selecao;

import javax.swing.JOptionPane;

public class Exercicio002 {
    public static void main(String[] args) throws Exception {
        int qtdMacas;

        qtdMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs serão compradas?")); 

        if(qtdMacas < 12) {
            JOptionPane.showMessageDialog(null, "Cada maçã vai custar R$ 1,30");
        } else {
            JOptionPane.showMessageDialog(null, "Cada maçã vai custar R$ 1,00");
        }
    }
}
