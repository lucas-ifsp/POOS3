package br.edu.ifsp.poo.aula04.ex01;

public class Circulo extends Figura{
    private double raio;

    public Circulo(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "- Circulo{" +
                "raio=" + raio +
                '}';
        return result;
    }
}
