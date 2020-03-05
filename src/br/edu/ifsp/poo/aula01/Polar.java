package br.edu.ifsp.poo.aula01;

import java.util.Scanner;

public class Polar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double r = scanner.nextDouble();

        double b = n - 90;
        double cRadiano = Math.toRadians(a - b); //ângulo do feixe com relação ao plano cartesiano em radianos
        double x2 = x1 + r * Math.cos(cRadiano);
        double y2 = y1 + r * Math.sin(cRadiano);
        System.out.println("("+Math.round(x2)+","+Math.round(y2)+")");
    }
}
