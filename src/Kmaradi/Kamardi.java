package Kmaradi;

public class Kamardi {
    public static void main(String[] args) {
        Clovek karel = new Clovek();
        karel.jmeno = "Karel Novák";
        karel.vek = 33;
        Clovek josef = new Clovek();
        josef.jmeno = "Josef Nový";
        josef.vek = 27;
        // Spřátelení
        karel.kamarad = josef.jmeno;
        josef.kamarad = karel.jmeno;
        // Představení
        karel.pozdrav();
        josef.pozdrav();
    }
}
