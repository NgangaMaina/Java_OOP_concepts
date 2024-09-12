package ObserverPattern;

public class Display implements WeatherObserver{
    private int temperature;
    private int humidity;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    private void display(){
        System.out.println("Temperature: " +temperature + "C, Humidity: " +humidity);
    }

    public static void main(String[] args) {
        //Creating the weather station:
        WeatherStation weatherStatiion = new WeatherData();

        //Creating the observers:
        WeatherObserver display1 = new Display();
        WeatherObserver display2 = new Display();

        //Registering the Observers:
        weatherStatiion.registerObserver(display1);
        weatherStatiion.registerObserver(display2);

        //Simulating the weather updates:
        ((WeatherData) weatherStatiion).setWeatherData(25, 65, 1010);

    }
}
