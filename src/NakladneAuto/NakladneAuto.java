package NakladneAuto;

public class NakladneAuto {
    private int max = 3000;
    public int naklad = 0;

    public int naloz(int plus) {
        this.naklad += plus;
        if (this.naklad >= max) {
            this.naklad -= plus;
        }
        return this.naklad;
    }

    public int vyloz(int minus) {

        if (minus >= this.naklad) {

        } else {
            this.naklad -= minus;
        }
        return this.naklad;
    }

}
