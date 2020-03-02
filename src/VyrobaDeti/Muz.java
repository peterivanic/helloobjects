package VyrobaDeti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Muz extends Clovek {
    private boolean muz;
    Random random = new Random();

    public Muz(String meno, String prieyvisko, String datum) {
        super(meno, prieyvisko, datum);
        muz = true;
    }

    public void plus(Clovek partner) {
        if (partner instanceof Zena) {
            Clovek dieta = null;
            int sanca = random.nextInt(2);
            if (sanca == 1) {
                dieta = new Zena("Eva", partner.getPriezvisko(), LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.y")));
            }
            if (sanca == 0) {
                dieta = new Muz("Adam", getPriezvisko(), LocalDate.now().format(DateTimeFormatter.ofPattern("d.M.y")));
            }
            System.out.println(toString() + " a " + partner.toString() + " mají dítě " + dieta.toString());
        }
    }

}
