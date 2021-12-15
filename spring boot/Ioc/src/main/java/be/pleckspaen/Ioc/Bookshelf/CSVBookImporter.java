package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.stereotype.Component;

@Component("csvImporter")
public class CSVBookImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through CSV");
    }
}
