package Adapter;

class TemperatureSensorAdapter implements Sensor {
    private TemperatureSensorLegacy tempSensor;

    public TemperatureSensorAdapter(TemperatureSensorLegacy tempSensor) {
        this.tempSensor = tempSensor;
    }

    @Override
    public String getData() {
        return tempSensor.readTemp();
    }
}
