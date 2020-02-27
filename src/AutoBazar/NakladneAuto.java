package AutoBazar;

public class NakladneAuto extends Auto {
    private int nosnost;

    public NakladneAuto(String nazov, String spz, int cena,int nosnost) {
        super(nazov, spz, cena);
        this.nosnost = nosnost;
    }
}

