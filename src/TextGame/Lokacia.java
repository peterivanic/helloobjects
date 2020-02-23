package TextGame;

public class Lokacia {
    private String nazov;
    private String popis;

    public Lokacia lokS;
    public Lokacia lokV;
    public Lokacia lokJ;
    public Lokacia lokZ;

    public Lokacia(String nazov, String popis) {
        this.nazov = nazov;
        this.popis = popis;
    }

    public void SusS(Lokacia lokacia){
        lokS = lokacia;
    }
    public void SusV(Lokacia lokacia){
        lokV = lokacia;
    }
    public void SusJ(Lokacia lokacia){
        lokJ = lokacia;
    }
    public void SusZ(Lokacia lokacia){
        lokZ = lokacia;
    }
    @Override
    public String toString() {
        return String.format("%s\n%s",nazov,popis);
    }
}
