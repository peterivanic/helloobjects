package Zdravic;

public class Program {
    public static void main(String[] args) {
        Zdravic zdravic = new Zdravic();

        zdravic.text = "Ahoj uzivatel";
        zdravic.pozdrav("Jano");
        zdravic.pozdrav("Riso");
        zdravic.text = "Ahoj progrmator";
        zdravic.pozdrav("Peter");

    }
}
