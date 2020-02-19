package HraTahovyBoj;

import java.util.Random;

public class Kocka {

    private int pocetStien ;
    private Random random;

    public Kocka(int pocetStien){
        this.pocetStien = pocetStien;
        random = new Random();

    }
    public int vratPocetStien(){
        return pocetStien;
    }
    public Kocka(){
        pocetStien = 6;
        random = new Random();
    }
    public int hod(){
        return random.nextInt(pocetStien) +1 ;

    }

    public String toString() {
        return String.format("Kocka s %d stranami",pocetStien);
    }
}
