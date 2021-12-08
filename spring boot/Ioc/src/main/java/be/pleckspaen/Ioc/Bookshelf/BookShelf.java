package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookShelf {


    private IBookImporter iBookImporter;

    @Autowired
    public BookShelf(IBookImporter iBookImporter){
        this.iBookImporter=iBookImporter;
    }

    public void importAndRead(){
        iBookImporter.bookImport();
    }

}
