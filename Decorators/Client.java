package Decorators;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting rectangle dimensions from user:
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        // Creating recty:
        Recctangle rectangle = new Recty(length, width);

        // Getting units from user:
        System.out.print("Enter unit (cm/in): ");
        String unit = scanner.next();
        rectangle = new UnitConversionDecorator(rectangle, unit);

        // Getting format from user:
        System.out.print("Enter format (decimal/scientific): ");
        String format = scanner.next();
        rectangle = new FormatDecorator( rectangle, format);

        // Displaying the formatted area:
        System.out.println("The area of the rectangle is: " + rectangle.formattedArea());

        scanner.close();
    }
}

