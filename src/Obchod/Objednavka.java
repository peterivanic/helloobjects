package Obchod;

import java.util.ArrayList;

public class Objednavka implements OrderInterface {
    private Zakaznik zakaznik ;
    private Adresa adresa ;
    private Produkt produkt;
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Integer> pocetProduktov = new ArrayList<>();
    private ArrayList<String> nazvy = new ArrayList<>();
    private ArrayList<Double> ceny =  new ArrayList<>();

    public Objednavka(int pocetKusov,Zakaznik zakaznik, Adresa adresa, Produkt produkt) {
        this.zakaznik = zakaznik;
        this.adresa = adresa;
        this.produkt = produkt;
        nazvy.add(produkt.getNazov());
        pocetProduktov.add(produkt.getPocet());
        ceny.add(produkt.getCena());
    }

    @Override
    public int getNumber() {
        return zakaznik.getCisloObhjednavky();
    }

    /**
     * Customer's first name
     */
    @Override
    public String getFirstName() {
        return zakaznik.getMeno();
    }

    /**
     * Customer's last name
     */
    @Override
    public String getLastName() {
        return zakaznik.getPriezvisko();
    }

    /**
     * Street
     */
    @Override
    public String getStreet() {
        return adresa.getUlica();
    }

    /**
     * House number
     */
    @Override
    public int getHouseNumber() {
        return adresa.getCisloDomu();
    }

    /**
     * Registry number
     */
    @Override
    public int getRegistryNumber() {
        return adresa.getCisloOrientacne();
    }

    /**
     * City
     */
    @Override
    public String getCity() {
        return adresa.getMesto();
    }

    /**
     * Zip code
     */
    @Override
    public String getZipCode() {
        return adresa.getPsc();
    }

    /**
     * Country
     */
    @Override
    public String getCountry() {
        return adresa.getStat();
    }

    /**
     * Product names
     */
    @Override
    public ArrayList<String> getProducts() {

        return nazvy;
    }

    /**
     * Product quantities
     */
    @Override
    public ArrayList<Integer> getProductQuantities() {

        return pocetProduktov;
    }


    /**
     * Product prices
     */
    @Override
    public ArrayList<Double> getProductPrices() {
        return ceny;
    }
}
