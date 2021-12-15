package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
@Scope("prototype")
public class BookShelf {


    private IBookImporter iBookImporter;

    @Autowired
    private List<IBookImporter> importers;

    @Value("${be.pleckspaen.config}")
    private String config;

    public BookShelf(@Qualifier("csvImporter") IBookImporter iBookImporter){
        this.iBookImporter=iBookImporter;
    }

    public void importAndRead(){
        importers.forEach(IBookImporter::bookImport);
    }


    @PostConstruct
    private void onConstruct(){
        System.err.println("Bookshelf open");
        System.err.println(config);
    }
    @PreDestroy
    private void onDestroy(){
        System.err.println("Bookshelf closed");
        System.err.println(config);
    }

}
