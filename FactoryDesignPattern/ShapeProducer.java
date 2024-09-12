package FactoryDesignPattern;

import java.util.Scanner;
public class ShapeProducer {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        ShapeFactory factory = null;
        Shape shape = null;


        System.out.println("Enter the shape you would want to generate");
        String shapeType = scanner.nextLine();

        switch (shapeType){
            case "circle":
            factory = new CircleFactory();
            break;
            case "square":
                factory = new SquareFactory();
                break;
            default:
                System.out.println("Enter a known shape (FactoryDesignPattern.Circle, FactoryDesignPattern.Square). ");
        }


        shape = factory.createShape();
        shape.drawShape();
    }
}
