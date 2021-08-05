package imc;
import javax.swing.JOptionPane;

public class Imc {
    static public void main(String[] args) throws Exception {
        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

        imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "IMC" + imc);

    }
}
