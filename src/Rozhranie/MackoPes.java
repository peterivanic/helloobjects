package Rozhranie;

public class MackoPes implements PesInterface,MackaInterface {

    @Override
    public void spievaj() {
        System.out.println("♫ ♫ ♫♫ ♫ ♫");
    }

    @Override
    public void mnaukni() {
        System.out.println("Mnauf!");

    }

    @Override
    public void stekaj() {
        System.out.println("Hauf hauf!");

    }
}

