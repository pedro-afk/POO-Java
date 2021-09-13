import carro.Carro;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        double valorDiaria;
        int options;
    
        do {   
            options = Integer.parseInt(JOptionPane.showInputDialog(""
             + "0 - sair \n"
             + "1 - alterar valor locação \n"
             + "2 - exibir dados do veículo \n"
             + "3 - cadastrar veículo \n"
            ));

            switch (options) {
                case 1:
                    valorDiaria = Double.parseDouble(JOptionPane.showInputDialog("Alterar dias locação")); 
                    carro.setValorDiaria(valorDiaria);
                    break;
                case 2: 
                    carro.mostrarCarro();
                    break;
                case 3:
                    carro.cadastraVeiculos();
                default:
                    break;
            }

        } while (options != 0);
    }

}
