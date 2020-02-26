package GeometrickeTvary;

public class Obdelnik extends Tvar {
    private float sirka;
    private float vyska;

    public Obdelnik(String farba,float sirka,float vyska) {
        super(farba);
        this.sirka=sirka;
        this.vyska=vyska;
    }
    public float obsah(){
        return sirka*vyska;
    }
}
