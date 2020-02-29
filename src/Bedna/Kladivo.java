package Bedna;

public class Kladivo extends Nastroj {
    public boolean obourucne;
    public Kladivo(int vaha, String nazov,boolean obouruc) {
        super(vaha, nazov);
        this.obourucne = obouruc;

    }

    @Override
    public void pracuj() {
        System.out.println("Zatloukám");
    }
}
