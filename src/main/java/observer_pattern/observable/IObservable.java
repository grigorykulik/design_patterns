package observer_pattern.observable;

import observer_pattern.observer.IObserver;

public interface IObservable {
    void register(IObserver io);
    void unregister(IObserver io);
    void pushUpdates();
}
