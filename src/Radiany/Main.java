package Radiany;

public class Main {
    public static void main(String[] args) {

        double u = 90,
                r = 6.28;
        System.out.println(r + " radiánů na stupně: " + Prevodnik.radianStupen(r));
        System.out.println(u + " stupňů na radiány: " + Prevodnik.stupenRadian(u));

    }
}
