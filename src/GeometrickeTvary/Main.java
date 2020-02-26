package GeometrickeTvary;

public class Main {
    public static void main(String[] args) {
        Trojuhelnik trojuhelnik = new Trojuhelnik("zelena",15,15,25);
        Obdelnik obdelnik=new Obdelnik("hneda",3,26);
        Kruh kruh = new Kruh("cerveny",7.5);
        double vysledok = obdelnik.obsah()+4*trojuhelnik.obsah();
        System.out.println(kruh.obsah());

        System.out.println("Obsah stromu je "+vysledok+"cm^2");
    }
}
