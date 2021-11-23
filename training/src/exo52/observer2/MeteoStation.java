package exo52.observer2;


import java.util.ArrayList;
import java.util.List;

public class MeteoStation {
    private List<Observer> observers;
    private List<Double> temperatures;
    private List<Double> humidities;


    public MeteoStation(){
        observers = new ArrayList<Observer>();
        temperatures=new ArrayList<Double>();
        humidities=new ArrayList<Double>();
    }

    public void addTemperature(Double temperature){
        temperatures.add(temperature);
        notifyAllObservers();
    }
    public void addHumidity(Double humidity){
        humidities.add(humidity);
        notifyAllObservers();
    }



    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public List<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public List<Double> getHumidities() {
        return humidities;
    }

    public void setHumidities(List<Double> humidities) {
        this.humidities = humidities;
    }

}
