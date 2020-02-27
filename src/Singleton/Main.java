package Singleton;

public class Main {
    public static void main(String[] args) {
        Databaze data = Databaze.getInstance();
        System.out.println(data.meno);
    }
}
