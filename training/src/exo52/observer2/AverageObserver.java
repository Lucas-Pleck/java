package exo52.observer2;

public class AverageObserver extends Observer {


    public AverageObserver(MaxObserver maxObserver) {
        super();
    }

    public AverageObserver(MeteoStation meteoStation) {
        this.meteoStation=meteoStation;
        this.meteoStation.attach(this);
    }

    @Override
    public void update() {
        this.meteoStation.getTemperatures();
        this.meteoStation.getHumidities();
        double averageTemp=0;
        double averageHum=0;

        for(Double temp:this.meteoStation.getTemperatures()){
            averageTemp+=temp;
        }
        averageTemp/=this.meteoStation.getTemperatures().size();
        System.out.println("Average temperature is : "+averageTemp);

        for(Double hum:this.meteoStation.getHumidities()){
            averageHum+=hum;
        }
        averageHum/=this.meteoStation.getHumidities().size();
        System.out.println("Average humidity rate is : "+averageHum);

    }
}
