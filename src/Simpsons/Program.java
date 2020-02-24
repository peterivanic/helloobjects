package Simpsons;

public class Program {
    public static void main(String[] args) {
        Osoba bart = new Osoba("Bart Simpson");
        Osoba marge =  new Osoba("Marge Bouvier");
        Osoba homer = new Osoba("Homer Simpson");
        Osoba abe = new Osoba("Abraham Simpson");
        Osoba penelope = new Osoba("Penelope Olsen");
        Osoba jackie = new Osoba("Jackie Bouvier");
        Osoba buvier = new Osoba("Pan Bouvier");

        bart.setMama(marge);
        bart.setOtec(homer);
        homer.setMama(penelope);
        homer.setOtec(abe);
        marge.setMama(jackie);
        marge.setOtec(buvier);

        System.out.println("Rodokmen pro osobu "+bart.getMeno());
        System.out.println(bart.getMeno());

        new Rodokmen(bart);
    }
}
