package AdapterDesignPattern;
import java.util.Scanner;
public class TempClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some temperature in fahrenheit");
        double fahrenheit = scanner.nextDouble();

        //Using the adapter to convert form Fahrenheit to Celsius:
        ThirdPartyTempConverter thirdPartyConverter = new ThirdPartyTempConverter();
        TempConverter converter = new TempAdapter(thirdPartyConverter);

        double celsius = converter.fahrenheitToCelcius(fahrenheit);
        System.out.println("The temperature in celsius is: " +celsius);
    }
}
