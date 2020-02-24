package Simpsons;

public class Osoba {
    private String Meno;
    private Osoba Mama;
    private Osoba Otec;

    public void setMama(Osoba meno) {
        Mama = meno;
    }
    public void setOtec(Osoba meno) {
        Otec = meno;
    }
    public String getMeno() {
        return Meno;
    }
    public Osoba getMama() {
        return Mama;
    }
    public Osoba getOtec() {
        return Otec;
    }
    public Osoba(String meno) {
        Meno = meno;
    }
    public Osoba() {
    }
}

