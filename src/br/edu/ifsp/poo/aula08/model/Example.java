package br.edu.ifsp.poo.aula08.model;

import java.util.Objects;

public class Example {
    private String name, description;

    public Example(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return name.equals(example.name) &&
                description.equals(example.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
