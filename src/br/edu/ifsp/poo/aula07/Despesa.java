package br.edu.ifsp.poo.aula07;

import java.time.LocalDate;

public class Despesa {
    private String description, category;
    private double valor;
    private LocalDate data;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
