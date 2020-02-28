package Narodeniny;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class Osoba {
    private LocalDate narodeniny;
    private int roky;

    public Osoba(LocalDate datum) {
        narodeniny = datum;
    }

    public int pocetRokov() {
        TemporalAmount doba = Period.between(narodeniny, LocalDate.now());
        roky = (int) doba.get(ChronoUnit.YEARS);
        return roky;
    }

    public int dniDoNarodenin() {
        int dni = narodeniny.getDayOfYear() - LocalDate.now().getDayOfYear();
        if (dni < 0) {
            dni = 365 + dni;
        }
        return dni;
    }
}
