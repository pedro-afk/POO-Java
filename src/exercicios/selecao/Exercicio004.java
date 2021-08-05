package exercicios.selecao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio004 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df =  new DecimalFormat();
        double nota1, nota2, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));
    
        df.setMaximumFractionDigits(2);
        
        media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "Aprovado com media: " + df.format(media));
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado com media: " + df.format(media));
        }

    }

}
