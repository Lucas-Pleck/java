package exo58.nonymousClass2;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherDataGenerate extends Timer {

    private int delay=0;
    private int interval=5000;
    private TimerTask timertTask;

    public WeatherDataGenerate() {
        this.timertTask=new TimerTask() {
            @Override
            public void run() {
                int temp = getRandom(-10,45);
                int humidity =getRandom(0,100);
                System.out.println("temperature : "+ temp);
                System.out.println("humidity : "+humidity);
            }
        };
        this.schedule(this.timertTask,delay,interval);
    }

    private Random random =new Random();

    private int getRandom(int min, int max){
        return min+ random.nextInt((max-min)+1);
    }

}
