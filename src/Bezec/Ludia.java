package Bezec;

import java.util.SortedMap;

public class Ludia {
    public static void main(String[] args) {
        Bezec karol = new Bezec();
        karol.meno = "Karel Nový";
        karol.vek = 25;

        System.out.println(karol.toString());
        karol.bez(10);
        karol.bez(10);
        karol.spi(2);
        karol.bez(10);



    }
}
