package TextGame;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Hra {
    public Lokacia lokacia;
    public String volba;

    public void pohyb(){
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println(lokacia.toString());

        String v1,v2,v3,v4;

        if (lokacia.lokJ != null){
            v1 = " jih";
        }else v1 = "";
        if (lokacia.lokS != null){
            v2 = " sever";
        }else v2 = "";
        if (lokacia.lokV != null){
            v3 = " východ";
        }else v3 = "";
        if (lokacia.lokZ != null){
            v4 = " západ";
        }else v4 = "";


        System.out.println();
        System.out.println(String.format("Můžeš jít na%s%s%s%s\n",v1,v2,v3,v4));

        System.out.println("Zadej příkaz: ");

        volba = sc.nextLine();


        switch (volba){
            case "jdi na jih":
                if (lokacia.lokJ != null){
                    this.lokacia = lokacia.lokJ;
                }else System.out.println("Tímto směrem nelze jít.");
                break;
            case "jdi na sever":
                if (lokacia.lokS != null){
                    this.lokacia = lokacia.lokS;
                }else System.out.println("Tímto směrem nelze jít.");
                break;
            case "jdi na východ":
                if (lokacia.lokV != null){
                    this.lokacia = lokacia.lokV;
                }else System.out.println("Tímto směrem nelze jít.");
                break;
            case "jdi na západ":
                if (lokacia.lokZ != null){
                    this.lokacia = lokacia.lokZ;
                }else System.out.println("Tímto směrem nelze jít.");
                break;
            case "konec":
                volba = "konec";
                break;
            default:
                System.out.println("Můj vstupní slovník neobsahuje tento příkaz.");
                break;
        }
    }
}
