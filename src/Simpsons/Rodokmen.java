package Simpsons;

public class Rodokmen {
    Osoba osoba = new Osoba();

    public Rodokmen(Osoba osoba){

        if (osoba.getOtec()!=null){
            System.out.println(osoba.getOtec().getMeno());
            new Rodokmen(osoba.getOtec());
        }
        if (osoba.getMama() != null){
            System.out.println(osoba.getMama().getMeno());
            new Rodokmen(osoba.getMama());
        }
    }
}
