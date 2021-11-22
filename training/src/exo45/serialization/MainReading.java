package exo45.serialization;

import java.io.*;

public class MainReading {

    public static void main(String[] args) throws IOException {
        String fileName ="personne.dat";
        ObjectInputStream in = null;


        try {
            in= new ObjectInputStream(new FileInputStream(fileName));
            System.out.println(in.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            in.close();
        }


    }



}
