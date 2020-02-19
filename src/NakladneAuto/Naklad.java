package NakladneAuto;

public class Naklad {
    public static void main(String[] args) {
        NakladneAuto nakladneAuto =new NakladneAuto();
        nakladneAuto.naloz(10000);
        nakladneAuto.naloz(500);
        nakladneAuto.vyloz(300);
        nakladneAuto.vyloz(1000);
        System.out.printf("V nákladním autě je naloženo %d kg.",nakladneAuto.naklad);
    }
}
