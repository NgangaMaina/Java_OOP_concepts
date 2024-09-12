package Recap;

public class AnimalManager {
    public String displayAnimalDetails(Animal animal){
        try {
            animal.makeSound();
            animal.sleep();
            System.out.println("Info: " + animal.getInfo());
            if(animal instanceof Flyable){
                Flyable flyingAnimal=(Flyable) animal;
                System.out.println(flyingAnimal.fly());
            }

        } catch (InvalidAnimalException e) {
            System.out.println("ERROR MESSAGE:" + e.getMessage());
        }
        return null;
    }
}
