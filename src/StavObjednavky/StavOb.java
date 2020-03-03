package StavObjednavky;

public enum StavOb {
    Nova ("Nová objednávka"),
    Prijata ("Objednávka byla přijata ke zpracování"),
    Potvrzena ("Objednávka byla potvrzena"),
    Dokoncena ("Zboží bylo expedováno");

    private String text;

    StavOb(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
