package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface TrafficLight {
    void addObserver(TrafficLightObserver observer);
    void remove (TrafficLightObserver observer);
    void notifyObservers();
    TrafficLightState getState();
    void setState(TrafficLightState state);
}
interface TrafficLightObserver{
    void update(TrafficLightState state);
}

class TrafficLightImpl implements TrafficLight{
    private TrafficLightState state;
    private List<TrafficLightObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(TrafficLightObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(TrafficLightObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TrafficLightObserver observer : observers) {
            observer.update(state);
        }
    }

    @Override
    public TrafficLightState getState() {
        return state;
    }

    @Override
    public void setState(TrafficLightState state) {
        this.state = state;
        notifyObservers();
    }
}

// Concrete Observer (TrafficLightDisplay)
class TrafficLightDisplay implements TrafficLightObserver {
    private String name;

    public TrafficLightDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(TrafficLightState state) {
        System.out.println(name + " Traffic Light is now " + state);
    }
}

// Traffic Light states
enum TrafficLightState {
    RED, YELLOW, GREEN
}


