package AdapterDesignPattern;

public class TempAdapter implements TempConverter{

    private ThirdPartyTempConverter thirdPartyTempConverter;

    public TempAdapter(ThirdPartyTempConverter thirdPartyTempConverter){
        this.thirdPartyTempConverter = thirdPartyTempConverter;
    }
    @Override
    public double fahrenheitToCelcius(double fahrenheit) {
        //Fahrenheit is first converted to kelvin using the third party library:
        double kelvin = thirdPartyTempConverter.fahrenheitToKelvin(fahrenheit);

        //Then the kelvin is converted to Celsius:
        return kelvinToCelsius(kelvin);
    }

    //Helper method to convert kelvin to Celsius:
    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
