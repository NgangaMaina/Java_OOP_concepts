package Decorators;

import java.awt.*;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        blueRectangle.draw();
    }
}
