package ObserverPattern;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        // Create a traffic light
        TrafficLight trafficLight = new TrafficLightImpl();
        // Create observers (traffic lights)
        TrafficLightObserver northLight = new TrafficLightDisplay("North");
        TrafficLightObserver southLight = new TrafficLightDisplay("South");
        TrafficLightObserver eastLight = new TrafficLightDisplay("East");
        TrafficLightObserver westLight = new TrafficLightDisplay("West");

        // Register observers
        trafficLight.addObserver(northLight);
        trafficLight.addObserver(southLight);
        trafficLight.addObserver(eastLight);
        trafficLight.addObserver(westLight);

        // Simulate state changes
        trafficLight.setState(TrafficLightState.GREEN);
        trafficLight.setState(TrafficLightState.YELLOW);
        trafficLight.setState(TrafficLightState.RED);
    }
}
