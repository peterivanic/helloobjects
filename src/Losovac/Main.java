package Losovac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Losovac losovac = new Losovac();
        Scanner sc =new Scanner(System.in);
        int volba = 0;

        while (volba!=3){
            System.out.println("Volba 1 losuj dalsie cislo");
            System.out.println("Volba 2 vypis vsetky vyzrebovane cisla");
            System.out.println("Volba 3 koniec");
            volba = sc.nextInt();
            switch (volba){
                case 1:
                    System.out.println(losovac.losuj());
                    break;
                case 2:
                    System.out.println(losovac.vypis());
                    break;
                case 3:
                    System.out.println("Koniec losovania dakujem za pouzitie");
                    break;
                default:
                    System.out.println("Neplatna volba");
            }
        }
    }
}
