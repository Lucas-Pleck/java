package be.pleckspaen.IocBeanFactory;

public class XMLBookImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through XML");
    }
}
