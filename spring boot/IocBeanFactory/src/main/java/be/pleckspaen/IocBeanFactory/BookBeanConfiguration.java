package be.pleckspaen.IocBeanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class BookBeanConfiguration {

    @Bean
    public BookShelf bookShelf(@Autowired List<IBookImporter> importers){
        BookShelf bookShelf=new BookShelf(importers);
        return bookShelf;
    }

    @Bean("xml")
    @Order(2)
    public IBookImporter xmlBookImporter(){
        IBookImporter iBookImporter=new XMLBookImporter();
        return iBookImporter;
    }

    @Bean("pdf")
    @Order(1)
    public IBookImporter pdfBookImporter(){
        IBookImporter iBookImporter=new PDFImporter();
        return iBookImporter;
    }

    @Bean("csv")
    @Order(2)
    public IBookImporter csvBookImporter(){
        IBookImporter iBookImporter=new CSVBookImporter();
        return iBookImporter;
    }
}
