package FactoryDesignPattern;

//Abstract creator class:
public abstract class ShapeFactory {
    public abstract Shape createShape();
}

//Concrete creator classes:
class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class SquareFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Square();
    }
}

