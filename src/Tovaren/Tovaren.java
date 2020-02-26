package Tovaren;

public class Tovaren {

    public static String vytvorBananove(int pocet) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < pocet; i++) {
            s.append(String.format("%s\n", Cukrovi.bananove()));
        }
        return s.toString();
    }
    public static String vytvorJahodove(int pocet) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < pocet; i++) {
            s.append(String.format("%s\n", Cukrovi.jahodove()));
        }
        return s.toString();
    }
    public static String vytvorCokoladove(int pocet) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < pocet; i++) {
            s.append(String.format("%s\n", Cukrovi.cokoladove()));
        }
        return s.toString();
    }
}
