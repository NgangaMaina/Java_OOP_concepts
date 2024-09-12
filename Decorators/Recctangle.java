package Decorators;

//Component interface: common interface for the rectangle and its decorators.
public interface Recctangle {
    double area();
    String formattedArea();
}


//Concrete component: calculates the area of the rectangle.
class Recty implements Recctangle{
    private double length;
    private double width;
    public Recty(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String formattedArea() {
        return String.valueOf(area());
    }
}

//Base decorator: Abstract class that implements the component interface and holds reference to the component object.
 abstract class RectangleDecorator implements Recctangle {
    private Recctangle rectangle;

    public RectangleDecorator(Recctangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double area() {
        return rectangle.area();
    }

    @Override
    public String formattedArea(){
        return rectangle.formattedArea();
    }
}

//Concrete decorators: Adds the functionalities to convert units and format the output:
 class UnitConversionDecorator extends RectangleDecorator {
    private String unit;

    public UnitConversionDecorator(Recctangle rectangle, String unit) {
        super((Recctangle) rectangle);
        this.unit = unit;
    }

    @Override
    public double area() {
        double area = super.area();
        switch (unit.toLowerCase()) {
            case "cm":
                return area * 6.4516;  // assuming the input area is in square inches
            case "in":
            default:
                return area;
        }
    }

    @Override
    public String formattedArea() {
        return String.format("%.2f %s", area(), unit);
    }
}
