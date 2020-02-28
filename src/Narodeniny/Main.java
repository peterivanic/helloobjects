package Narodeniny;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Zadej datum narození:");
        String dat = sc.nextLine();
        Datum datum=new Datum(dat);
        Osoba o = new Osoba(datum.getDatum());

        System.out.printf("Je ti %d let a narozeniny máš za %d dní.",o.pocetRokov(),o.dniDoNarodenin());

    }
}
