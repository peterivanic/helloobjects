package HraTahovyBoj;

public class Bojovnik {
    private String meno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kocka kocka;

    public Bojovnik(String meno,int zivot,int utok, int obrana,Kocka kocka){
        this.meno = meno;
        this.zivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kocka = kocka;
    }
    @Override
    public String toString() {
        return meno;
    }
    public boolean zije() {
      return(zivot>0);
    }

    public String grafickyZivot() {
        StringBuilder s = new StringBuilder("[");
        int celkom = 10;
        double pocet = Math.round(((double)zivot / maxZivot) * celkom);
        if ((pocet == 0) && (zije())) {
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s.append("#");
        }
        for (int i = 0; i < celkom - pocet; i++) {
            s.append(" ");
        }
        s.append("]");
        return s.toString();
    }
}
