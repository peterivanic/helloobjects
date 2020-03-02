package VyrobaDeti;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static Object Clovek;

    public static void main(String[] args) {
        ArrayList<Clovek> ludia = new ArrayList<>();

        Clovek karolM = new Muz("Karel", "Novák", "2.5.1988");
        Clovek jozef = new Muz("Josef", "Nový", "19.3.1978");
        Clovek jan = new Muz("Jan", "Marek", "28.4.1968");
        Clovek karolS = new Muz("Karel", "Novák", "25.6.1958");
        Clovek maria = new Zena("Marie", "Nová", "15.8.1988");
        Clovek vera = new Zena("Věra", "Nováková", "2.10.1978");
        Clovek simona = new Zena("Simona", "Mladá", "8.1.1968");
        Clovek michaela = new Zena("Michaela", "Marná", "6.12.1958");

        ludia.add(karolM);
        ludia.add(jozef);
        ludia.add(jan);
        ludia.add(karolS);
        ludia.add(maria);
        ludia.add(vera);
        ludia.add(simona);
        ludia.add(michaela);
        Collections.sort(ludia);


        for (Clovek c : ludia){
            System.out.println(c.toString());
        }
        karolM.plus(maria);
    }

}
