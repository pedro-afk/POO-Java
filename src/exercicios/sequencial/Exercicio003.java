package exercicios.sequencial;

import javax.swing.JOptionPane;

public class Exercicio003 {
    public static void main(String[] args) throws Exception {
        double custoFabrica, impostos, porcentagemDist, custoTotal;

        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica"));
        
        porcentagemDist = (custoFabrica * 28) / 100;
        impostos = (custoFabrica * 45) / 100;

        custoTotal = porcentagemDist + impostos + custoFabrica;

        JOptionPane.showMessageDialog(null, "Porcentagem do distribuidorao custo de fabrica: " + porcentagemDist + " \nImpostos aplicados ao custo de fabrica: " + impostos + " \nCusto final: " + custoTotal);

    }
}
