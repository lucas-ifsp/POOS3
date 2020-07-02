package br.edu.ifsp.poo.aula05.EA01;

import java.util.Objects;

public class Retangulo extends Figura implements  Desenhavel{
    private double largura, comprimento;

    public Retangulo(int x, int y, double largura, double l2) {
        super(x, y);
        this.largura = largura;
        this.comprimento = l2;
    }

    public void regularizar(){
        System.out.println("retangularizei");
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
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public void desenhar() {
        System.out.println("um lindo retangulo");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Retangulo retangulo = (Retangulo) o;
        return Double.compare(retangulo.largura, largura) == 0 &&
                Double.compare(retangulo.comprimento, comprimento) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(largura, comprimento);
    }

    public static double mean(double... is){
        double soma = 0;
        for (double i : is)
        soma += i;
        return soma / is.length;
    }

}
