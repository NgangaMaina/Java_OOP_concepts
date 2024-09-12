package AdapterDesignPattern;

//Third party library to convert temperature form Fahrenheit to kelvin.
public class ThirdPartyTempConverter {
    public double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit + 459.67) * 5/9;
    }
}
