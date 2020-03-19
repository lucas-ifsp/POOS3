package br.edu.ifsp.poo.aula04.ex01;

public class Retangulo extends Figura{

    private double largura, comprimento;

    public Retangulo(int x, int y, int largura, int comprimento) {
        super(x, y);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double area() {
        return largura * comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " - Retangulo{" +
                "largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
        return result;
    }
}
