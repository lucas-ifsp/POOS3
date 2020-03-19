package br.edu.ifsp.poo.aula04.ex01;

public class Figura {
    private int x, y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double area(){
        return 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
