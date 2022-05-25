package observer_pattern.observable;

import observer_pattern.observer.IObserver;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
    private int temperature;
    private ArrayList<IObserver> observers = new ArrayList();

    public WeatherStation() {
        this.temperature = 0;
    }

    @Override
    public void register(IObserver io) {
        this.observers.add(io);
    }

    @Override
    public void unregister(IObserver io) {
        this.observers.add(io);
    }

    @Override
    public void pushUpdates() {
        observers.forEach(o -> o.update());
    }

    public int getState() {
        return this.temperature;
    }

    public void setState(int temperature) {
        this.temperature = temperature;
    }
}
