package observer_pattern.observer;

import observer_pattern.observable.WeatherStation;

public class PhoneDisplay extends GenericDisplay implements IObserver {
    public PhoneDisplay(WeatherStation station) {
        super(station);
    }

    @Override
    public void update() {
        System.out.println("Phone display: temperature = " + super.getStation().getState());
    }
}
