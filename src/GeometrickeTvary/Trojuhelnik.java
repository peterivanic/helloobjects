package GeometrickeTvary;

public class Trojuhelnik extends Tvar {
    private double stranaA;
    private double stranaB;
    private double stranaC;

    public Trojuhelnik(String farba,double stranaA,double stranaB,double stranaC){
        super(farba);
        this.stranaA=stranaA;
        this.stranaB=stranaB;
        this.stranaC=stranaC;
    }
    public double obsah(){
        double s = (stranaA+stranaB+stranaC)/2;
        double a = s-stranaA;
        double b = s-stranaB;
        double c = s-stranaC;
        double v = s*a*b*c;
        double obsah = Math.sqrt(v);
        return obsah;
    }
}
