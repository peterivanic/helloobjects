package Bird;

public class Bird {
    public int vaha = 50;
    public int hlad = 100;

    public void zozer(int potrava){
        this.vaha = vaha + potrava;
        this.hlad = hlad - potrava;
    }
}
