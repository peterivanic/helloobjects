package VyrobaDeti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Zena extends Clovek {
    private boolean zena;
    Random random = new Random();

    public Zena(String meno, String prieyvisko, String datum) {
        super(meno, prieyvisko, datum);
        zena = true;
    }


    public void plus(Clovek partner) {
        Clovek dieta = null;
        if (partner instanceof Muz) {
            int sanca = random.nextInt(2);
            if (sanca == 1) {
                dieta = new Zena("Eva", getPriezvisko(), LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.y")));
            }
            if (sanca == 0) {
                dieta = new Muz("Adam", partner.getPriezvisko(), LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.y")));
            }

            System.out.println(toString() + " a " + partner.toString() + " maju dieta: " + dieta.toString());

        }
    }
}
