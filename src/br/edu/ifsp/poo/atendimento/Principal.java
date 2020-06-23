package br.edu.ifsp.poo.atendimento;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Corona c1 = new Corona("São Carlos", 350, 100, 11);
        Corona c2 = new Corona("Ibatexas", 30, 5, 1);
        Corona c3 = new Corona("Araraquara", 600, 150, 30);
        Corona c4 = new Corona("Ribeirão Preto", 3500, 400, 100);
        Corona c5 = new Corona("Ribeirão Preto", 3500, 400, 100);

        Corona[] arrayCorona = {c1, c2, c3, c4};
        //System.out.println(arrayCorona[2]); // acesso direto

        List<Corona> listCorona = new ArrayList<>();
        listCorona.add(c1);
        listCorona.add(c2);
        listCorona.add(c3);
        listCorona.add(c4);

        listCorona.remove(c5);
        
        Set<Corona> nomesCidade = new TreeSet(new DeadComparator());
        nomesCidade.add(c1);
        nomesCidade.add(c2);
        nomesCidade.add(c3);
        nomesCidade.add(c4);
        nomesCidade.add(c5);
/*
        for (Corona s : nomesCidade) {
            System.out.println("Corona = " + s);
        }*/

        Map<Corona, String> mapCorona = new HashMap<>();
        mapCorona.put(c1, "Boné");
        mapCorona.put(c2, "Tiozinho");
        //mapCorona.put(c3, "Mariazinha");
        mapCorona.put(c4, "Luizinho");
        mapCorona.put(c5, "Paulinho");

        System.out.println(mapCorona.get(c4));




        for (Map.Entry<Corona, String> entry : mapCorona.entrySet()) {
            System.out.println("entry = " + entry);
        }
    }
}
