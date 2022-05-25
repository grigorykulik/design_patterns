package observer_pattern.observer;

import observer_pattern.observable.WeatherStation;

public class LcdDisplay extends GenericDisplay implements IObserver {
    public LcdDisplay(WeatherStation station) {
        super(station);
    }

    @Override
    public void update() {
        System.out.println("LCD Display: temperature = " + super.getStation().getState());
    }
}
