package br.edu.ifsp.poo.aula03.ea01;

public class Casamento {

    Pessoa p1, p2;

    public Casamento(Pessoa p1, Pessoa p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void mostraCasamento(){
        System.out.println(p1.nome + " está casado com " + p2.nome);
    }

}

