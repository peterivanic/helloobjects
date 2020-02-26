package Bezec;

public class Program {
    public static void main(String[] args) {

        Javista karol = new Javista(0,"Karel Nový",25,"IDEA");
        System.out.println(karol.toString());
        karol.bez(10);
        karol.bez(10);
        karol.programuj(5);
        karol.bez(10);
        karol.spi(8);
        karol.programuj(100);
    }
}
