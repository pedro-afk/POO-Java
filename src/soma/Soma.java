package soma;
import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args) throws Exception {
        int n1, n2, soma;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        soma = n1 + n2;

        JOptionPane.showMessageDialog(null, "Numero 1: " + n1 + "\n" +
        "Numero 2: " + n2 + "\nTotal: " + soma);
    }
}