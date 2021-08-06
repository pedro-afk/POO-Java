package exercicios.repeticao;

import javax.swing.JOptionPane;

public class Exercicio003 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if(numero2 > numero1) {
            int i = numero1;
            int soma = numero1;
            while(i < numero2){
                i++;
                soma+=i;
            }
            // System.out.println(soma);
            JOptionPane.showMessageDialog(null, "Soma: " + soma);
        } else {
            JOptionPane.showMessageDialog(null, "O segundo numero não pode ser maior que o primeiro");
        }

        

    }
}
