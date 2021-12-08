package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.stereotype.Component;

@Component
public class XMLBookImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through XML");
    }
}
