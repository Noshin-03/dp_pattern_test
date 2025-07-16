package Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensorAdapter(new TemperatureSensorLegacy());
        Sensor humiditySensor = new HumiditySensorAdapter(new HumiditySensorLegacy());

        System.out.println("Temperature Sensor: " + tempSensor.getData());
        System.out.println("Humidity Sensor: " + humiditySensor.getData());
    }
}
