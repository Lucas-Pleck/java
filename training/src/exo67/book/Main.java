package exo67.book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book leLivreDeLaJungle = new Book();


        BookElement chapitre1 =new BookElement(ElementType.CHAPITRE,"chap1");
        BookElement scene1 = new BookElement(ElementType.SCENE,"sc1");
        BookElement article1 = new BookElement(ElementType.ARTICLE,"art1");
        BookElement chapitre2 =new BookElement(ElementType.CHAPITRE,"chap2");
        BookElement scene2 = new BookElement(ElementType.SCENE,"sc2");

        scene1.addElement(article1);
        chapitre1.addElement(scene1);
        chapitre2.addElement(scene2);

        leLivreDeLaJungle.addBookElements(chapitre1);
        leLivreDeLaJungle.addBookElements(chapitre2);

        for (BookElement element:leLivreDeLaJungle.getElements()) {
            System.out.println(element);
        }



    }
}
