package Bedna;

public class Pila extends Nastroj {

    public Pila(int vaha, String nazov) {
        super(vaha, nazov);
    }
    @Override
    public void pracuj() {
       System.out.println("piluji");
    }
}
