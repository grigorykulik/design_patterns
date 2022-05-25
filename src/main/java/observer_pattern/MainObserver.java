package observer_pattern;

import observer_pattern.observable.WeatherStation;
import observer_pattern.observer.LcdDisplay;
import observer_pattern.observer.PhoneDisplay;

public class MainObserver {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        PhoneDisplay pd = new PhoneDisplay(ws);
        LcdDisplay ld = new LcdDisplay(ws);
        ws.register(pd);
        ws.register(ld);

        ws.pushUpdates();
        ws.setState(10);
        ws.pushUpdates();
    }
}
