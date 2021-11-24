package exo64.threads;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyThread> myThreads = new ArrayList<>();
        for (int i=0; i<15;i++){
            MyThread myThread = new MyThread("Thread"+i);
            myThreads.add(myThread);
            myThread.start();
        }
        System.out.println("Tous les threads sont démarés");
        for (MyThread mT: myThreads){
            try {
                mT.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Tous les threads sont terminés");
    }
}
