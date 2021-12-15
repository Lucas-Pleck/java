package be.pleckspaen.IocBeanFactory;

import org.springframework.stereotype.Component;


public class PDFImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through PDF");
    }
}
