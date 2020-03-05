package br.edu.ifsp.poo.aula03.ea01;

public class Principal {
    public static void main(String[] args) {
        Pessoa c1 = new Pessoa();
        Pessoa c2 = new Pessoa(18, "Tião");

        c1.nome = "Paulo";
        c1.idade = 70;

        c2.nome = "Stephanie";

        Casamento matrimonio = new Casamento(c1, c2);
        matrimonio.mostraCasamento();

        int[] x = new int[10];
        x[0] =1;
        x[1] = 2;
        System.out.println(Pessoa.soma(2,3,4));
    }
}
