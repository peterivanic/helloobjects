package Obchod;

public class Zakaznik {
    private String meno;
    private String priezvisko;
    private int cisloObhjednavky;

    public Zakaznik(int cisloObhjednavky , String meno, String priezvisko ) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.cisloObhjednavky = cisloObhjednavky;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getCisloObhjednavky() {
        return cisloObhjednavky;
    }
}
