package Garage;

public class Car {
    public String spz;
    public String color;
    public void zaparkuj(Garage garaz) {
        garaz.got = this;
    }

    @Override
    public String toString() {
        return " auto s poznavaci znackou " + spz;
    }
}
