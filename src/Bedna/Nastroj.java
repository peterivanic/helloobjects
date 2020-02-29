package Bedna;

public abstract class Nastroj {
    public int vaha;
    public String nazov;

    public Nastroj(int vaha, String nazov) {
        this.vaha = vaha;
        this.nazov = nazov;
    }

    public abstract void pracuj();

    @Override
    public String toString() {
        return nazov;
    }
}
