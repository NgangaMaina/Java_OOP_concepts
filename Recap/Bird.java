package Recap;

public class Bird extends Animal implements Flyable{
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
    System.out.println("Chripchrip!");
    }

    @Override
    public String getInfo()  {
        return (getName() + " is an exotic breed and very endangered.");
    }
    @Override
    public String fly() {
        return "This bird is flying way up into the sky";
    }
}
