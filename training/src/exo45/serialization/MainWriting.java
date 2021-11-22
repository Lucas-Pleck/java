package exo45.serialization;

import exo41.Zoo.AnimalNotFoundException;
import exo41.Zoo.Animals;
import exo41.Zoo.Lions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainWriting {

    public static void main(String[] args) {
        String fileName ="personne.dat";

        Personne personne=new Personne("Jean","Delarue","17/12/1876","chanteur");
        ObjectOutputStream out=null;
                System.out.println(personne);

        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(personne);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
