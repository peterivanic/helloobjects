package Bedna;

public class Main {
    public static void main(String[] args) {
        Bedna bedna = new Bedna(10000);
        Nastroj pila = new Pila(2500,"Zrezivělá pila");
        Nastroj kladivko = new Kladivo(1200,"Kladívko",false);
        Nastroj kladivo = new Kladivo(3000,"Velké kladivo",true);
        Nastroj buracie = new Kladivo(4000,"Bourací kladivo",true);
        Nastroj sraubovak = new Sroubovak(800,"Šroubovák Philips");
        Nastroj elektricky = new ElektrickySroubovak(1800,"Elektrický šroubovák Bosh" ,100);

        bedna.vypis();
        bedna.vlozNastroj(kladivko);
        bedna.vlozNastroj(kladivo);
        bedna.vlozNastroj(buracie);
        bedna.vlozNastroj(pila);
        bedna.vlozNastroj(sraubovak);
        bedna.vlozNastroj(elektricky);
        bedna.vypis();
        bedna.nastrojePracujte();
        bedna.getVahaObourucnych();
    }
}
