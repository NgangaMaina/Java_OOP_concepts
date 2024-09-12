package Decorators;

public interface Shape {
    void draw();
}
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Creating a cirlce");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Creating a Rectangle");
    }
}

    class RedShapeDecorator implements Shape{
    private Shape decoratedShape;
    public RedShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

        @Override
        public void draw() {
            decoratedShape.draw();
            System.out.println("Colouring the shape red");

        }
    }

    class BlueShapeDecorator implements Shape{
          private Shape decoratedShape;
          public BlueShapeDecorator(Shape decoratedShape){
              this.decoratedShape = decoratedShape;
          }

        @Override
        public void draw() {
              decoratedShape.draw();
              System.out.println("Colouring the shape blue");

        }
    }

