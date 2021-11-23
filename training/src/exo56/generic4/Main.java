package exo56.generic4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Media leSoir=new Newspaper("Le Soir");
        Media laUne=new Video("La Une");
        Media ilEtaitUneFois =new Book("Il etait une fois");

        Library<Media> mylibrary=new Library<>();

        mylibrary.addMedia(laUne);
        mylibrary.addMedia(leSoir);
        mylibrary.addMedia(ilEtaitUneFois);

        System.out.println(mylibrary.retrieveLast());

    }
}
