package exo52.observer2;

public class Main {
    public static void main(String[] args) {
        MeteoStation meteoStation=new MeteoStation();
        MaxObserver maxObserver=new MaxObserver(meteoStation);
        AverageObserver averageObserver=new AverageObserver(meteoStation);



        meteoStation.addHumidity(50.1);
        meteoStation.addHumidity(60.5);
        meteoStation.addHumidity(10.8);
        meteoStation.addHumidity(80.0);
        meteoStation.addHumidity(20.9);

        meteoStation.addTemperature(18.5);
        meteoStation.addTemperature(22.2);
        meteoStation.addTemperature(34.0);
        meteoStation.addTemperature(11.1);
        meteoStation.addTemperature(19.8);

        System.out.println(meteoStation);
    }
}
