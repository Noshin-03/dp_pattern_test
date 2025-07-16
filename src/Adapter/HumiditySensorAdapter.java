package Adapter;

class HumiditySensorAdapter implements Sensor {
    private HumiditySensorLegacy humiditySensor;

    public HumiditySensorAdapter(HumiditySensorLegacy humiditySensor) {
        this.humiditySensor = humiditySensor;
    }

    @Override
    public String getData() {
        return humiditySensor.getHumidityLevel();
    }
}
