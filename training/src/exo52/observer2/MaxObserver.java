package exo52.observer2;

public class MaxObserver extends Observer {


    public MaxObserver(MeteoStation meteoStation) {
        this.meteoStation=meteoStation;
        this.meteoStation.attach(this);
    }

    @Override
    public void update() {
        double maxTemp=Double.MIN_VALUE;
        double maxHum=Double.MIN_VALUE;

        for(Double temp:this.meteoStation.getTemperatures()){
            if(temp>maxTemp){
                maxTemp=temp;
            }
        }
        System.out.println("max temperature is : "+ maxTemp);

        for(Double hum:this.meteoStation.getTemperatures()){
            if(hum>maxHum){
                maxHum=hum;
            }
        }
        System.out.println("max humidity rate is : "+ maxHum);
    }
}
