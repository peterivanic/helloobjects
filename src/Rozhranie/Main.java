package Rozhranie;

public class Main {
    public static void main(String[] args) {

        MackaInterface macka = new Macka();
        PesInterface pes = new Pes();
        MackoPes mackoPes = new MackoPes();

        macka.mnaukni();
        macka.spievaj();
        pes.stekaj();
        mackoPes.stekaj();
        mackoPes.spievaj();






    }
}
