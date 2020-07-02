package br.edu.ifsp.poo.aula05.EA01;

public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10, 10, 14);

        System.out.println("c1= " + c1);
        
        Retangulo r1 = new Retangulo(1, 3,15, 0.5);
        System.out.println("r1 = " + r1);

        Figura[] figuras = new Figura[]{c1, r1};
        for (Figura f : figuras) {
            System.out.println("f.calcularArea() = " + f.calcularArea());
            if(f instanceof Retangulo) {
                Retangulo r = (Retangulo) f;

            }
        }

        Desenhavel desenhavel = new Retangulo(1,1,1, 1);


        desenhavel.desenhar();

        System.out.println(Retangulo.mean(10,10,20 ,0));
    }
}
