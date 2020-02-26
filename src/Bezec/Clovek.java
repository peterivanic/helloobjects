package Bezec;

public class Clovek {
    protected int unava;
    protected String meno;
    protected int vek;

    public Clovek(int unava, String meno, int vek) {
        this.unava = unava;
        this.meno = meno;
        this.vek = vek;
    }

    public void bez(int km) {
        if (unava < 20) {
            for (int i = 0; i < km; i++) {
                unava += 1;
            }
        } else {
            System.out.println("Jsem příliš unavený");
        }
    }
    public void spi(int h) {
        if (unava > 0) {
            for (int i = 0; i <= h; i++)
                unava -= 10;
            if (unava<0){
                unava=0;
            }
        }
    }
    public String toString() {
        return String.format("%s(%d)", meno, vek);
    }
}
