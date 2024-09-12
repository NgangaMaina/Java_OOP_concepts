package Recap;

import Recap.AnimalManager;
import Recap.Bird;
import Recap.Cat;
import Recap.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dogi= new Dog ("Puncho", 7);
        Cat chut= new Cat("Jackie", 4);
        Bird birdie= new Bird ("", 2);

        AnimalManager animalManager= new AnimalManager();

        System.out.println("Recap.Dog's Information:");
        animalManager.displayAnimalDetails(dogi);
        System.out.println("  ");

        System.out.println("Recap.Cat's Information:");
        animalManager.displayAnimalDetails(chut);
        System.out.println("  ");

        System.out.println("Recap.Bird's Information:");
        animalManager.displayAnimalDetails(birdie);



    }
}
