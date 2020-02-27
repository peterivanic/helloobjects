package AutoBazar;

import java.util.ArrayList;

public class AutoBazar {

    private int kasa;
    private int hodnotaAut;
    public ArrayList<String> auta = new ArrayList<>();

    public AutoBazar(int kasa) {
        this.kasa = kasa;
    }

    public int odkup(Auto auto) {
        hodnotaAut += auto.getCena();
        auta.add(auto.toString());
        return kasa -= auto.getCena();
    }

    public int predaj(Auto auto) {
        hodnotaAut -= auto.getCena();
        auta.remove(auto.toString());
        return kasa += auto.getCena();
    }

    public int getKasa() {
        return kasa;
    }

    public int getPocetAut() {
        return auta.size();
    }

    public int getHodnotaAut() {
        return hodnotaAut;

    }
}
