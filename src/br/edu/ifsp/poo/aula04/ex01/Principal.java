package br.edu.ifsp.poo.aula04.ex01;

public class Principal {


    public static void main(String[] args) {
        Triangulo t = new Triangulo(0,0, 3,4, 5);
        Retangulo r = new Retangulo(1, 1, 10, 20);
        Circulo c = new Circulo(2,2, 3);

        System.out.println(t + " Área = " + t.area());
        System.out.println(r + " Área = " + r.area());
        System.out.println(c + " Área = " + c.area());

    }
}
