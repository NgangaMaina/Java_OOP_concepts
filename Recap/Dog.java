package Recap;

public class Dog extends Animal {

    Dog(String name, int age) {
        super( name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Ruff! Ruff!");

    }

    @Override
    public String getInfo() {
       return (getName()+  "was brought up abroad and imported to Kenya last year");

    }
}
