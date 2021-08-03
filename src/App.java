import javax.swing.JOptionPane;

public class App {
    // public static void main(String[] args) throws Exception {
    //     String nome;
    //     int idade;
    //     double altura;

    //     nome = JOptionPane.showInputDialog("Digite seu nome");
    //     idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
    //     altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

    //     JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" +
    //     "Idade: " + idade + "\nAltura: " + altura);

    //     /* Conversões
    //         texto para inteiros: Integer.parseInt();
    //         texto para double: Double.parseDouble();
    //     */

    // }

    public static void main(String[] args) throws Exception {
        int n1, n2, soma;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        soma = n1 + n2;

        JOptionPane.showMessageDialog(null, "Numero 1: " + n1 + "\n" +
        "Numero 2: " + n2 + "\nTotal: " + soma);
    }
}
