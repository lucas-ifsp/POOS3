package br.edu.ifsp.poo.aula04.ea01;

public class Virus {

    private String nome;
    private boolean mortal;
    private int diasContagio;



    public Virus() {
    }

    public Virus(String nome, boolean mortal, int diasContagio) {
        this.nome = nome;
        this.mortal = mortal;
        this.diasContagio = diasContagio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    public int getDiasContagio() {
        return diasContagio;
    }

    public void setDiasContagio(int diasContagio) {
        this.diasContagio = diasContagio;
    }


    @Override
    public String toString() {
        return "Virus{" +
                "nome='" + nome + '\'' +
                ", mortal=" + mortal +
                ", diasContagio=" + diasContagio +
                '}';
    }


}
