package state;

public class Yellow implements TrafficLight{
    @Override
    public void handle(TrafficLightState state) {
        System.out.println("Yellow!");
        sleep(1000);
        state.setState(new Green());
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
