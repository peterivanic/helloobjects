package HraTahovyBoj;

public class Hra {
    public static void main(String[] args) {
        Kocka sestStena = new Kocka();
        Kocka desatStena = new Kocka(10);

        System.out.println(sestStena);
        for (int i = 0 ; i <10; i++){
            System.out.print(sestStena.hod()+ "  ");
        }
        System.out.println();

        System.out.println(desatStena);
        for (int i =0;i<10;i++){
            System.out.print(desatStena.hod()+"   ");
        }
    }
}
