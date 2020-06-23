package br.edu.ifsp.poo.atendimento;

import java.util.Comparator;

public class DeadComparator implements Comparator<Corona> {
    @Override
    public int compare(Corona t1, Corona t2) {
        if(t1.getNumDead() > t2.getNumDead())
            return 1;
        else if(t1.getNumDead() < t2.getNumDead())
            return -1;
        else
            return 0;
    }
}

