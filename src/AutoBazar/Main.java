package AutoBazar;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto("Škoda 120","123ABC",10000);
        Auto fabia = new Auto("Škoda Fabia","456DEF",100000);
        Auto ferrari = new Auto("Ferrari FF","789GHI",3000000);
        NakladneAuto tatra = new NakladneAuto("Tatra 811","534NGS",50000,20);
        NakladneAuto renault = new NakladneAuto("Renault Midliner","489GSR",100000,30);

        AutoBazar bazar = new AutoBazar(5000000);
        bazar.odkup(skoda);
        bazar.odkup(fabia);
        bazar.odkup(ferrari);
        bazar.odkup(tatra);
        bazar.odkup(renault);

        System.out.println(String.format("V bazaru je %s automobilů",bazar.getPocetAut()));
        System.out.println(String.format("Na pokladně je %d Kč",bazar.getKasa()));
        System.out.println(String.format("Celková cena automobilů je %d Kč",bazar.getHodnotaAut()));
        System.out.println(bazar.auta.toString());
    }
}
