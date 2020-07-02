package br.edu.ifsp.poo.aula05.EA01;

import java.util.HashMap;
import java.util.Map;

public class PrincipalTeste {

    public static void main(String[] args) {
        Map<Pessoa, Pessoa>  pessoaMap = new HashMap<>();

        pessoaMap.put(new Pessoa("2222", "Paulo", 30), new Pessoa("11111", "Jão", 10));

        System.out.println(pessoaMap.get(new Pessoa("2222", "Paulo", 30)));

       
    }

}
