package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ChanelObservable implements Observable {

    private final List<Observer> observers;

    public ChanelObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addAll(List<Observer> observers) {
        this.observers.addAll(observers);
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : observers) {
            observer.update(videoTitle);
        }
    }

    public void publishVideo(String title) {
        System.out.println("Публикация нового видео: " + title);
        notifyObservers(title);
    }
}
