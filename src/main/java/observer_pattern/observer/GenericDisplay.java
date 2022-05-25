package observer_pattern.observer;

import observer_pattern.observable.WeatherStation;

public class GenericDisplay {
    private WeatherStation station;

    public GenericDisplay(WeatherStation station) {
        this.station = station;
    }

    public WeatherStation getStation() {
        return this.station;
    }
}
