package PersonDog;

public class Program {
    public static void main(String[] args) {
        Dog azer = new Dog("Azer",1);
        Person karel = new Person("karel");
        Person lenka = new Person("lenka");
        karel.setDog(azer);
        lenka.dog = azer;

        System.out.println(azer.toString());
        azer.older();
        lenka.dog.older();
        System.out.println(lenka.dog.toString());
    }
}
