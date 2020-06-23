package br.edu.ifsp.poo.atendimento;

import java.util.Objects;

public class Corona {
    private String cidade;
    private long numDoentes;
    private long numCurados;
    private long numDead;

    public Corona(String cidade, long numDoentes, long numCurados, long numDead) {
        this.cidade = cidade;
        this.numDoentes = numDoentes;
        this.numCurados = numCurados;
        this.numDead = numDead;
    }

    @Override
    public String toString() {
        return "Corona{" +
                "cidade='" + cidade + '\'' +
                ", numDoentes=" + numDoentes +
                ", numCurados=" + numCurados +
                ", numDead=" + numDead +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corona corona = (Corona) o;
        return numDoentes == corona.numDoentes &&
                numCurados == corona.numCurados &&
                numDead == corona.numDead &&
                cidade.equals(corona.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidade, numDoentes, numCurados, numDead);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getNumDoentes() {
        return numDoentes;
    }

    public void setNumDoentes(long numDoentes) {
        this.numDoentes = numDoentes;
    }

    public long getNumCurados() {
        return numCurados;
    }

    public void setNumCurados(long numCurados) {
        this.numCurados = numCurados;
    }

    public long getNumDead() {
        return numDead;
    }

    public void setNumDead(long numDead) {
        this.numDead = numDead;
    }
}
