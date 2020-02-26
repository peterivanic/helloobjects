package HraTahovyBoj;

public class Hra {
    public static void main(String[] args) {

        Kocka desatStena = new Kocka(10);
        Bojovnik hrdina = new Bojovnik("Zalgoren", 100, 15, 10, desatStena);
        Bojovnik shadow = new Bojovnik("Shadow", 65, 15, 5, desatStena);
        Bojovnik tank = new Bojovnik("Tank", 170, 10, 10, desatStena);
        Bojovnik mag = new Mag("Geralt",100,10,10,100,25,desatStena);

        Arena arena = new Arena();
        arena.Arena(mag,hrdina,desatStena);
        arena.zapas();



    }
}
