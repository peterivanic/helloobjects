package Bezec;

public class Javista extends Clovek {
    private String IDE;

    public Javista(int unava, String meno, int vek, String IDE) {
        super(unava, meno, vek);
        this.IDE = IDE;
    }

    public void programuj(int pocetRiadkov) {
        int p = -1;
        if (unava < 20) {
            for (int i = 0; i <= pocetRiadkov; i++) {
                if (i % 10 == 0) {
                    p += 1;
                }
            }
            unava += p;
        } else {
            System.out.println("Jsem příliš unavený, abych programoval");
        }
    }
}
