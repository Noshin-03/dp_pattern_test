package state;

public class TrafficLightState {
    private TrafficLight currentState;

    public TrafficLightState(TrafficLight initial) {
        this.currentState = initial;
    }

    public void setState(TrafficLight state) {
        this.currentState = state;
    }

    public void change() {
        currentState.handle(this);
    }
}
