package exercicios.sequencial;

import javax.swing.JOptionPane;

public class Exercicio002 {
    public static void main(String[] args) throws Exception {
        
        double convertCm, polegadas;
        
        polegadas = Integer.parseInt(JOptionPane.showInputDialog("Insira as polegadas"));

        convertCm = polegadas * 2.54;
    
        JOptionPane.showMessageDialog(null, polegadas + " polegadas equilave a: " + convertCm + " cm");
    }
}
