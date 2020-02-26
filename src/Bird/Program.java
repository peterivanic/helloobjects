package Bird;

public class Program {
    public static void main(String[] args) {
        Bird vtak = new Bird();
        AngryBird angryVtak = new AngryBird();

        System.out.println(String.format("Jsem pták s váhou %d a hladem %d.",vtak.vaha,vtak.hlad));
        vtak.zozer(20);
        System.out.println(String.format("Jsem pták s váhou %d a hladem %d.",vtak.vaha,vtak.hlad));
        System.out.println(String.format("Jsem angry-pták s váhou %d a hladem %d, míra mého vzteku je %d.",angryVtak.vaha,angryVtak.hlad,angryVtak.vztek));
        angryVtak.provokuj(5);
        System.out.println(String.format("Jsem angry-pták s váhou %d a hladem %d, míra mého vzteku je %d.",angryVtak.vaha,angryVtak.hlad,angryVtak.vztek));
        angryVtak.zozer(100);
        angryVtak.provokuj(5);
        System.out.println(String.format("Jsem angry-pták s váhou %d a hladem %d, míra mého vzteku je %d.",angryVtak.vaha,angryVtak.hlad,angryVtak.vztek));
    }
}
