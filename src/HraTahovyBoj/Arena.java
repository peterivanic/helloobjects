package HraTahovyBoj;

public class Arena {
    private Bojovnik bojovnik1;
    private Bojovnik bojovnik2;
    private Kocka kocka;
    int pocetKol = 0;

    public void Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kocka kocka) {
        this.bojovnik1 = bojovnik1;
        this.bojovnik2 = bojovnik2;
        this.kocka = kocka;
    }

    private void vypisZpravu(String zprava) {
        System.out.println(zprava);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.err.println("Chyba, nepovedlo se uspat vlákno");
        }
    }
    public String vypisBojovnika(Bojovnik bojovnik) {
      String s =  String.format("%s %s\n\n",bojovnik,bojovnik.grafickyZivot());
        if (bojovnik instanceof Mag){
         s = String.format("%s %s\n" +
                 "mana :%s\n\n",bojovnik,bojovnik.grafickyZivot(),((Mag) bojovnik).grafickaMana());
        }

        return s;
    }

    private String vykresli() {
       return String.format("                                                                                                                                    \n" +
               "                                                                                                                                    \n" +
               "               AAA               RRRRRRRRRRRRRRRRR   EEEEEEEEEEEEEEEEEEEEEENNNNNNNN        NNNNNNNN               AAA               \n" +
               "              A:::A              R::::::::::::::::R  E::::::::::::::::::::EN:::::::N       N::::::N              A:::A              \n" +
               "             A:::::A             R::::::RRRRRR:::::R E::::::::::::::::::::EN::::::::N      N::::::N             A:::::A             \n" +
               "            A:::::::A            RR:::::R     R:::::REE::::::EEEEEEEEE::::EN:::::::::N     N::::::N            A:::::::A            \n" +
               "           A:::::::::A             R::::R     R:::::R  E:::::E       EEEEEEN::::::::::N    N::::::N           A:::::::::A           \n" +
               "          A:::::A:::::A            R::::R     R:::::R  E:::::E             N:::::::::::N   N::::::N          A:::::A:::::A          \n" +
               "         A:::::A A:::::A           R::::RRRRRR:::::R   E::::::EEEEEEEEEE   N:::::::N::::N  N::::::N         A:::::A A:::::A         \n" +
               "        A:::::A   A:::::A          R:::::::::::::RR    E:::::::::::::::E   N::::::N N::::N N::::::N        A:::::A   A:::::A        \n" +
               "       A:::::A     A:::::A         R::::RRRRRR:::::R   E:::::::::::::::E   N::::::N  N::::N:::::::N       A:::::A     A:::::A       \n" +
               "      A:::::AAAAAAAAA:::::A        R::::R     R:::::R  E::::::EEEEEEEEEE   N::::::N   N:::::::::::N      A:::::AAAAAAAAA:::::A      \n" +
               "     A:::::::::::::::::::::A       R::::R     R:::::R  E:::::E             N::::::N    N::::::::::N     A:::::::::::::::::::::A     \n" +
               "    A:::::AAAAAAAAAAAAA:::::A      R::::R     R:::::R  E:::::E       EEEEEEN::::::N     N:::::::::N    A:::::AAAAAAAAAAAAA:::::A    \n" +
               "   A:::::A             A:::::A   RR:::::R     R:::::REE::::::EEEEEEEE:::::EN::::::N      N::::::::N   A:::::A             A:::::A   \n" +
               "  A:::::A               A:::::A  R::::::R     R:::::RE::::::::::::::::::::EN::::::N       N:::::::N  A:::::A               A:::::A  \n" +
               " A:::::A                 A:::::A R::::::R     R:::::RE::::::::::::::::::::EN::::::N        N::::::N A:::::A                 A:::::A \n" +
               "AAAAAAA                   AAAAAAARRRRRRRR     RRRRRRREEEEEEEEEEEEEEEEEEEEEENNNNNNNN         NNNNNNNAAAAAAA                   AAAAAAA\n" +
               "\n" +
               "************************************************************* _ %d KOLO _*************************************************************\n" +
               "\n"+
               "%s " +
               "%s ",pocetKol,vypisBojovnika(bojovnik1),vypisBojovnika(bojovnik2));



    }

    public void zapas() {
        Bojovnik b1 = bojovnik1;
        Bojovnik b2 = bojovnik2;
        boolean poradie = (kocka.hod() <= (kocka.vratPocetStien() / 2));
        if (poradie) {
            b1 = bojovnik2;
            b2 = bojovnik1;
        }
        while (b1.zije() && b2.zije()) {
            pocetKol +=1;
            vypisZpravu(vykresli());
            b1.utoc(b2);
            vypisZpravu(b1.vratSpravu());
            vypisZpravu(b2.vratSpravu());
            if (b2.zije()) {
                b2.utoc(b1);
                vypisZpravu(b2.vratSpravu());
                vypisZpravu(b1.vratSpravu());
            }
        }
    }
}
