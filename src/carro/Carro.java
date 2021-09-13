package carro;
import javax.swing.JOptionPane;

public class Carro {
    private String marca, modelo;
    private int codigo, diasLocacao;
    private double valorDiaria;

    public double getCodigo() { return codigo; }
    public double getDiasLocacao() { return diasLocacao; }
    public double getValorDiaria() { return valorDiaria; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setDiasLocacao(int diasLocacao) { this.diasLocacao = diasLocacao; }
    public void setValorDiaria(double valorDiaria) { this.valorDiaria = valorDiaria; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void cadastraVeiculos() {
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do veículo")); 
        setCodigo(codigo);

        diasLocacao = Integer.parseInt(JOptionPane.showInputDialog("Dias locação")); 
        setDiasLocacao(diasLocacao);

        valorDiaria = Double.parseDouble(JOptionPane.showInputDialog("Valor diaria")); 
        setValorDiaria(valorDiaria);

        marca = JOptionPane.showInputDialog("Marca do veículo"); 
        setMarca(marca);

        modelo = JOptionPane.showInputDialog("Modelo do veículo"); 
        setModelo(modelo);

    }

    public void mostrarCarro() {
        JOptionPane.showMessageDialog(null, 
            "Código do veículo: " + codigo +
            "\nDias Locaçao: " + diasLocacao +
            "\nValor Diaria: " + valorDiaria +
            "\nMarca: " + marca +
            "\nModelo: " + modelo);
    }

}
