package ObserverPattern;

//Subject:
public interface WeatherStation {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
//Observer:
interface WeatherObserver{
    void update(int temperature, int humidity, int pressure);

}

