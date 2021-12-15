package be.pleckspaen.IocBeanFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class BookShelf {

    private IBookImporter iBookImporter;

    private List<IBookImporter> importers;



    public void importAndRead(){
        importers.forEach(IBookImporter::bookImport);
    }


    public BookShelf(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }

    public BookShelf(List<IBookImporter> importers) {
        this.importers = importers;
    }

    public void setiBookImporter(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }
}
