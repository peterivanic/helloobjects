package Deti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Clovek implements Comparable {
    private String meno;
    private String priezvisko;
    private LocalDate datum;
    private String datumNar;
    public static final DateTimeFormatter FORMAT_DATA_BEZ_CASU = DateTimeFormatter.ofPattern("d'.'M'.'y");

    public Clovek(String meno, String priezvisko, String datumNar) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNar = datumNar;
        this.datum = LocalDate.parse(datumNar, DateTimeFormatter.ofPattern("d.M.y"));
    }

    public void plus(Clovek partner) {

    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {

        char s = datumNar.charAt(datumNar.length() - 1);
        char a = datumNar.charAt(datumNar.length() - 2);
        return
                meno + " " + priezvisko + " " + a + s;
    }

    @Override
    public int compareTo(Object o) {
        Clovek other = (Clovek) o;
        if(meno.equals(other.meno) && priezvisko.equals(other.priezvisko))
            return datum.compareTo(other.datum);
        return meno.compareTo(other.meno);

    }
}

