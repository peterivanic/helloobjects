package GeometrickeTvary;

public class Kruh extends Tvar {
    private double polomer;

    public Kruh(String farba,double polomer){
        super(farba);
        this.polomer = polomer;
    }

    public double obsah(){
        return Math.PI*(Math.pow(polomer,2));
    }
}
