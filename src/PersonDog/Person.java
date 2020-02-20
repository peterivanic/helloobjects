package PersonDog;

public class Person {
    public String name;
    public Dog dog;

    public void setDog(Dog dog) {
       this.dog = dog;
    }
    public Person(String name){
        this.name=name;
    }
}
