package Losovac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Losovac {
    private ArrayList<Integer> cisla;
    private Random random;

    public Losovac() {
        cisla = new ArrayList<>();
        random = new Random();
    }

    public int losuj() {
        int cislo = random.nextInt(100) + 1;
        cisla.add(cislo);
        return cislo;
    }

    public String vypis(){
        StringBuilder s = new StringBuilder();
        Collections.sort(cisla);
        for (int i : cisla){
            s.append(i).append(" ");
        }
        return s.toString();
    }
}
