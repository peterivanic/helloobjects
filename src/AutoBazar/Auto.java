package AutoBazar;

public class Auto {
    private String nazov;
    private String spz;
    private int cena;

    public Auto(String nazov, String spz, int cena) {
        this.nazov = nazov;
        this.spz = spz;
        this.cena = cena;
    }

    public int getCena(){
        return cena;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",nazov,spz,cena);
    }
}
