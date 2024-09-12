package ErrorHandlingAndFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComputeSqrt {
    public static void main(String[] args) {
        String filepath="C:\\Users\\vad2c\\IdeaProjects\\_2.1OOPs\\src\\numbers.txt";

        try{
            BufferedReader reader= new BufferedReader(new FileReader(filepath));
            String line= reader.readLine();
            if (line != null) {
                int number = Integer.parseInt(line);
                reader.close();


                if (number < 0) {
                    throw new IllegalArgumentException("The number in the file is negative.");
                }

                double squareRoot = Math.sqrt(number);
                System.out.println("FactoryDesignPattern.Square root of " + number + " is " + squareRoot);

            } else{
                    System.err.println("The file is empty.");
                }

            } catch (IOException e) {
                System.err.println("Unable to read data from the file: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("The file contains invalid data: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.err.println("ArithmeticException while calculating the square root: " + e.getMessage());
            }
    }
}
