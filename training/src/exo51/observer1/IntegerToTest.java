package exo51.observer1;

import java.util.ArrayList;
import java.util.List;

public class IntegerToTest {
    private List<Observer> observers;
    private int integer;

    public IntegerToTest() {
        observers = new ArrayList<Observer>();
    }

    public void setInteger(int integer) {
        this.integer = integer;
        notifyAllObservers();
    }

    public int getInteger() {
        return integer;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }


    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

}


