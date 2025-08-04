package state;

import static java.lang.Thread.sleep;

public class Red implements TrafficLight {
    @Override
    public void handle(TrafficLightState state) {
        System.out.println("Red light!");
        sleep(10000);
        state.setState(new Yellow());
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
