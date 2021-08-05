package exercicios.selecao;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio006 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df =  new DecimalFormat();
        int tipoCombustivel, litros, valDesconto;
        double desconto, valorTotal;


        litros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros de combustivel"));
        tipoCombustivel = Integer.parseInt(JOptionPane.showInputDialog("Tipo do combustivel, 1-álcool, 2-gasolina"));
        
        df.setMaximumFractionDigits(2);

        if(tipoCombustivel == 1) {
            valorTotal = litros * 2.90;
            if(litros <= 20) {
                valDesconto = 3;
                desconto = valorTotal * valDesconto / 100;
            } else {
                valDesconto = 5;
                desconto = valorTotal * valDesconto / 100;
            }
            JOptionPane.showMessageDialog(null, 
                "Tipo do combustivel: alcool" + 
                "\nQuantidade de litros: " + litros + 
                "\nValor total R$ " + df.format(valorTotal) + 
                "\nDesconto " + valDesconto + "% aplicado R$ " + df.format(desconto) + 
                "\nValor final R$ " + df.format(valorTotal - desconto)
            );
        } else {
            valorTotal = litros * 3.30;
            if(litros <= 20) {
                valDesconto = 4;
                desconto = valorTotal * 4 / 100;
            } else {
                valDesconto = 6;
                desconto = valorTotal * 6 / 100;  
            }
            JOptionPane.showMessageDialog(null, 
                "Tipo do combustivel: gasolina" + 
                "\nQuantidade de litros: " + litros + 
                "\nValor total R$ " + df.format(valorTotal) + 
                "\nDesconto " + valDesconto + "% aplicado R$ " + df.format(desconto) + 
                "\nValor final R$ " + df.format(valorTotal - desconto)
            );
        }
    }
}
