package HraTahovyBoj;

public class Mag extends Bojovnik {
    protected int maxMana;
    protected int mana;
    protected int magickyUtok;

    public Mag(String meno, int zivot, int utok, int obrana, int mana, int magickyUtok, Kocka kocka) {
        super(meno, zivot, utok, obrana, kocka);
        this.maxMana = mana;
        this.mana = mana;
        this.magickyUtok = magickyUtok;
    }
    public String grafickaMana(){
       return grafickyUkazatel(mana,maxMana);
    }
    @Override
    public void utoc(Bojovnik protivnik) {
        if (mana < maxMana) {
            mana += 10;
            if (mana > maxMana) {
                mana = maxMana;
            }
            super.utoc(protivnik);
        } else {
            int uder = magickyUtok + kocka.hod();
            nastavSpravu(String.format("%s použil magiu za %s hp", meno, uder));
            protivnik.bran(uder);
            mana = 0;
        }
    }
}
