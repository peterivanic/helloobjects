package Bedna;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bedna {
    private int nosnost;
    private int vaha = 0;
    private int vahaObourucnych = 0;
    private ArrayList<Nastroj> nastroje = new ArrayList<>();

    public Bedna(int nosnost) {
        this.nosnost = nosnost;
    }

    public void vlozNastroj(Nastroj nastroj) {
        if (nosnost >= (vaha + nastroj.vaha)) {
            nastroje.add(nastroj);
            vaha += nastroj.vaha;
            if (nastroj instanceof Kladivo) {
                if (((Kladivo) nastroj).obourucne)
                    vahaObourucnych += nastroj.vaha;
            }
        }
    }
    public List<Nastroj> getNastroje() {
        return Collections.unmodifiableList(nastroje);
    }

    public void vypis() {
        if (vaha == 0) {
            System.out.println("Bedna je prázdná.");
        } else {
            int pocitadlo = 0;
            StringBuilder s = new StringBuilder();
            for (Nastroj nastroj : nastroje) {
                if (pocitadlo == nastroje.size()-1){
                    s.append(nastroj.nazov);
                }else{
                    s.append(nastroj.nazov).append(", ");
                    pocitadlo+=1;
                }
            }
            System.out.println("V bedně je: " + s);
        }
    }
    public void nastrojePracujte() {
        for (Nastroj nastroj : nastroje) {
            nastroj.pracuj();
        }
    }
    public void getVahaObourucnych() {
        System.out.println(String.format("Váha obouručních kladiv je %d gramů", vahaObourucnych));
    }
}
