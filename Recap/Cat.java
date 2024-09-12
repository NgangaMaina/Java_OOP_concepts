package Recap;

public class Cat extends Animal {


    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww!");

    }

    @Override
    public String getInfo() {
        return  (getName()+ "Only eats manufactured cat food and not just any meat");

    }
}
