package Bedna;

public class Sroubovak extends Nastroj {
    public Sroubovak(int vaha, String nazov) {
        super(vaha, nazov);
    }

    @Override
    public void pracuj() {
        System.out.println("Šroubuji");
    }
}
