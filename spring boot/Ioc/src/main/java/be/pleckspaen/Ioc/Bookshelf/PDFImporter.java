package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.stereotype.Component;

@Component("pdfImporter")
public class PDFImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through PDF");
    }
}
