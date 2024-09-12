package Recap;

import Recap.InvalidAnimalException;

abstract class Animal {
    private final String name;
    private final int age;

    Animal(String name, int age){
        this.name=name;
        this.age = age;
    }
    public abstract void makeSound();
    public String getInfo() throws InvalidAnimalException {
        if(name == null){
            throw new InvalidAnimalException("That animal name is invalid!");
        }
        return "Name" +name;
    }
    public void sleep(){
        System.out.println("zzzzzz....");
    }
    public String getName(){
        return name;
    }

}
