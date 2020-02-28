package Narodeniny;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

public class Datum {
    private LocalDate datum;

    public Datum(String datum) {
         this.datum = LocalDate.parse(datum, DateTimeFormatter.ofPattern("d.M.y"));
    }

    public LocalDate getDatum() {
        return datum;
    }
}
