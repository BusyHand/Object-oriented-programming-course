package patterns.observer;


import java.util.List;

public interface Observable {

    void addAll(List<Observer> observers);

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers(String message);
}
