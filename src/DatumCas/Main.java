package DatumCas;

import javax.swing.text.DateFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<LocalDate> datumy = new ArrayList<>();

        System.out.println("Vypisuji součty cifer v datu pro následujících 7 dní");
        for (int i = 0;i<7;i++){
            LocalDate den =LocalDate.now().plusDays(i);
            datumy.add(den);
        }

        for (LocalDate datum : datumy) {
            int d = datum.getDayOfYear();
            int m = datum.getMonthValue();
            int r = datum.getYear();
            int s = d + m + r;
            System.out.println(datum.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " - " + s);
        }
        Scanner sc = new Scanner(System.in,"UTF-8");
        System.out.println("Pro zadaný interval datumů vypíše všechny pátky 13.:");
        System.out.println("Zadejte 1. datum:");
        String p = sc.nextLine();
        System.out.println("Zadejte 2. datum:");
        String d = sc.nextLine();

        LocalDate prvy = LocalDate.parse(p, DateTimeFormatter.ofPattern("d.M.y"));
        LocalDate druhy = LocalDate.parse(d, DateTimeFormatter.ofPattern("d.M.y"));

        long doba = ChronoUnit.DAYS.between(prvy, druhy);
        System.out.println("Pátky 13.: ");

        for (int i = 0; i < doba; i++) {
            prvy.plusDays(i);
            if (prvy.plusDays(i).getDayOfWeek() == DayOfWeek.FRIDAY && prvy.plusDays(i).getDayOfMonth() ==13){
                System.out.print(prvy.plusDays(i).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))+", ");
            }
        }


    }
}
