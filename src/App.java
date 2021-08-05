import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        double altura;

        nome = JOptionPane.showInputDialog("Digite seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" +
        "Idade: " + idade + "\nAltura: " + altura);

        /* Conversões
            texto para inteiros: Integer.parseInt();
            texto para double: Double.parseDouble();
        */
    }
}
