package PersonDog;

public class Dog {
    private int age;
    private String name;

    public int older(){
       return age += 1;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("%s (%d)",name,age);
    }
}
