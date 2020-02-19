package Bezec;

public class Bezec {
    private int unava = 0;
    public String meno;
    public int vek;

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
        }
    }
    public String toString() {
        return String.format("%s(%d)", meno, vek);
    }
}
