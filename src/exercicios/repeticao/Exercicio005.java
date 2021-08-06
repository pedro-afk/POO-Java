package exercicios.repeticao;

import javax.swing.JOptionPane;

public class Exercicio005 {
    public static void main(String[] args) throws Exception {
        double chico = 1.5, ze = 1.1;
        int ano = 0;

        while (chico >= ze) {
            chico += 0.02;
            ze += 0.03; 
            ano++;
        }
        JOptionPane.showMessageDialog(null, "Serão necessarios: " + ano + " anos para que \nZé seja maior que chico!");
    }   
}
