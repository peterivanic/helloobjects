package Obchod;

public class Adresa {
    private String ulica;
    private int cisloDomu;
    private int cisloOrientacne;
    private String mesto;
    private String psc;
    private String stat = "Česká republika" ;

    public Adresa(String ulica, int cisloDomu, int cisloOrientacne, String mesto, String psc) {
        this.ulica = ulica;
        this.cisloDomu = cisloDomu;
        this.cisloOrientacne = cisloOrientacne;
        this.mesto = mesto;
        this.psc = psc;
    }

    public String getUlica() {
        return ulica;
    }

    public int getCisloDomu() {
        return cisloDomu;
    }

    public int getCisloOrientacne() {
        return cisloOrientacne;
    }

    public String getMesto() {
        return mesto;
    }

    public String getPsc() {
        return psc;
    }

    public String getStat() {
        return stat;
    }
}