package Obchod;

public class Main {
    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(1, "Tomáš", "Marný");
        Adresa adresa = new Adresa("Ve Svahu", 10, 2, "Praha", "10000");
        Produkt produkt = new Produkt("Body pro ITnetwork.cz", "Body pro zpřístupnění prémiového obsahu a dosažení vašeho vysněného zaměstnání v IT.", 239);
        Objednavka objednavka = new Objednavka(1,zakaznik,   adresa, produkt);

        Gateway brana = new Gateway();
        brana.processOrder(objednavka);

    }
}
