package state;

public class State {
    public static void main(String[] args) {
        TrafficLightState light = new TrafficLightState(new Red());
        light.change();
    }
}
