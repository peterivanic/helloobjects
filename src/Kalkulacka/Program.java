package Kalkulacka;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");

        System.out.println("Zadej 1. číslo:");
        float cislo1 = Float.parseFloat(sc.nextLine());
        System.out.println("Zadej 2. číslo:");
        float cislo2 = Float.parseFloat(sc.nextLine());
        Kalkulacka kalkulacka = new Kalkulacka();

        System.out.println("Součet: " + kalkulacka.plus(cislo1,cislo2));
        System.out.println("Rozdíl: " + kalkulacka.minus(cislo1,cislo2));
        System.out.println("Součin: " + kalkulacka.krat(cislo1,cislo2));
        System.out.println("Podíl: " + kalkulacka.delene(cislo1,cislo2));

    }

}
