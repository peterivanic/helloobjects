package Bedna;

public class ElektrickySroubovak extends Sroubovak {
    int kapacita;
    public ElektrickySroubovak(int vaha, String nazov,int kapacita) {
        super(vaha, nazov);
        this.kapacita=kapacita;
    }
}
