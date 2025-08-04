package state;

public class Green implements TrafficLight {
    @Override
    public void handle(TrafficLightState state) {
        System.out.println("Green!");
        sleep(5000);
        state.setState(new Red());
        state.change();
    }

    public void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
