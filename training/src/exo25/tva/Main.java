package exo25.tva;

import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;

public class Main {
    public static void main(String[] args) {
        Produit productFirst=new Produit("BE1234","computer",548,1600);
        Produit productSecond=new Produit("BE5678","smartphone",848,160,0.12);
        Produit productThird=new Produit("BE9123","keyboard",148,20,0.6);

        System.out.println(productFirst);
        productFirst.addStock();
        productSecond.addStock(5);
        System.out.println(productSecond);

        productFirst.reduceStock(10000);

    }
}
