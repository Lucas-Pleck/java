package be.pleckspaen.IocBeanFactory;


import org.springframework.beans.factory.annotation.Autowired;

public class BookShelf {
    @Autowired
    private IBookImporter iBookImporter;

    public void importAndRead(){
        iBookImporter.bookImport();
    }


}
