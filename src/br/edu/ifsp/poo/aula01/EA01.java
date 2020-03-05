package br.edu.ifsp.poo.aula01;

import java.util.Scanner;

public class EA01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if(a > 0 && b > 0 && c > 0){
            if((a + b) > c && (a + c) > b && (b + c) > a){
                if(a == b && a == c){
                    System.out.println("Equilatero");
                }else if(a == b || a == c || b == c){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Escaleno");
                }
            }else{
                System.out.println("Nao forma triangulo");
            }
        }else{
            System.out.println("Erro");
        }

    }
}
