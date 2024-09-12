package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherStation{
    private int temperature;
    private int humidity;
    private int pressure;
    private List<WeatherObserver> observers = new ArrayList<>();

    public void setWeatherData(int temperature, int humidity, int pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
      for(WeatherObserver observer : observers){
          observer.update (temperature, humidity, pressure);
      }
    }
}
