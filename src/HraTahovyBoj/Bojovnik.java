package HraTahovyBoj;

public class Bojovnik {
    protected String meno;
    protected int zivot;
    protected int maxZivot;
    protected int utok;
    protected int obrana;
    protected Kocka kocka;
    protected String sprava;

    public Bojovnik(String meno, int zivot, int utok, int obrana, Kocka kocka) {
        this.meno = meno;
        this.zivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kocka = kocka;
        this.maxZivot = zivot;
    }

    @Override
    public String toString() {
        return meno;
    }

    public int getZivot() {
        return zivot;
    }

    public boolean zije() {
        return (zivot > 0);
    }


    protected String grafickyUkazatel(int aktulny, int max) {
        String s = "[";
        int celkem = 20;
        double pocet = ((double) aktulny / max) * celkem;
        if ((pocet == 0) && (zije())) {
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s += "█";
        }
        for (int i = 0; i < celkem - pocet; i++) {
            s += " ";
        }
        s += "]";
        return s;
    }

    public String grafickyZivot() {
        return grafickyUkazatel(zivot, maxZivot);
    }

    public void utoc(Bojovnik protivnik) {
        int uder = utok + kocka.hod();
        nastavSpravu(String.format("%s utoci silou %d hp", meno, uder));
        protivnik.bran(uder);
    }

    public void bran(int uder) {
        int zranenie = uder - (obrana + kocka.hod());

        if (zranenie > 0) {
            zivot -= zranenie;
            sprava = String.format("%s utrpel zranenie %d hp", meno, zranenie);
            if (zivot < 0) {
                zivot = 0;
                sprava += " a ZOMREL";
            } else {
                sprava += " a odrazil utok\n";
            }
            nastavSpravu(sprava);
        } else {
            sprava = String.format("%s odrazil utok bez straty zivota\n", meno);
        }

    }

    public void nastavSpravu(String sprava) {
        this.sprava = sprava;
    }

    public String vratSpravu() {
        return sprava;
    }

}
