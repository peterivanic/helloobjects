package Obchod;

import java.util.ArrayList;

public class Produkt {

    private String produkt;
    private String nazov;
    private double cena;
    private int pocet = 1;



    public Produkt( String nazov, String produkt, double cena) {
        this.produkt = produkt;
        this.nazov = nazov;
        this.cena = cena;

    }

    public String getProdukt() {
        return produkt;
    }

    public int getPocet() {
        return pocet;
    }

    public String getNazov() {
        return nazov;
    }

    public double getCena() {
        return cena;
    }
}