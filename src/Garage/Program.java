package Garage;

public class Program {
    public static void main(String[] args) {
        Garage bouda = new Garage();
        Car ford = new Car();

        ford.spz = "ABC1234";
        ford.color = "red";
        ford.zaparkuj(bouda);
        System.out.println(bouda.popisStav());
    }
}
