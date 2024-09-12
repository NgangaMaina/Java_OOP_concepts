package FactoryDesignPattern;

import java.util.Random;

//FactoryDesignPattern.Shape interface that will be implemented by all the shape classes.
public interface Shape {
    void drawShape();
}

//Concrete FactoryDesignPattern.Shape classes with constructors to generate random dimensions for  the shapes.
 class Circle implements Shape {
    private double radius;
    public Circle() {
        Random rand = new Random();
        this.radius = 1 + rand.nextDouble() * 9; //The radius of our circle is set to 1 <= r < 10.
    }
    @Override
    public void drawShape() {
        System.out.println("FactoryDesignPattern.Circle with radius " + radius);
    }
}

class Square implements Shape{
    private double side;
    public Square(){
        Random rand = new Random();
        this.side = 1 + rand.nextDouble() * 9; //The sides of our square are set to 1 <= r < 10.
    }
    @Override
    public void drawShape() {
        System.out.println("FactoryDesignPattern.Circle with radius " + side);

    }
}