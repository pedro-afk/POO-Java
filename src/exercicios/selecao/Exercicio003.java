package exercicios.selecao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio003 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df =  new DecimalFormat();
        int codigoIndentificacao;
        double valorTotalCompra, desconto;

        valorTotalCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor total da compra"));
        codigoIndentificacao = Integer.parseInt(JOptionPane.showInputDialog(
            "Codigo indentificação, (1)Cliente comum, (2)Funcionário, (3)Cliente vip"
        ));

        if(codigoIndentificacao == 1) {
            JOptionPane.showMessageDialog(null, "Sem desconto a ser aplicado, valor total" + valorTotalCompra);
        } else if (codigoIndentificacao == 2) {
            desconto = valorTotalCompra * 10 / 100;
            df.setMaximumFractionDigits(2);
            JOptionPane.showMessageDialog(null, "Desconto de 10% aplicado para funcionário, valor total: " +  df.format(desconto));
        } else {
            desconto = valorTotalCompra * 5 / 100;
            df.setMaximumFractionDigits(2);
            JOptionPane.showMessageDialog(null, "Desconto de 5% aplicado para cliente vip, valor total: " + df.format(desconto));
        }
    }
}
