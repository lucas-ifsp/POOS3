package br.edu.ifsp.poo.aula03.ea01;

public class Pessoa {
    int idade;
    String nome;
    Casamento casamento;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public static int soma(double b, int... a ){
        int soma = 0;
        for (int num:a) {
            soma += num;
        }
        return soma;
    }

    public int getIdade() {
        return idade;
    }

    public Casamento getCasamento() {
        Casamento c1 = new Casamento(this, this);
        return c1;
    }

    public void setCasamento(Casamento casamento) {
        this.casamento = casamento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
