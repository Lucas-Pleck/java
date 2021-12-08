package be.pleckspaen.IocBeanFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookBeanConfiguration {

    @Bean
    public BookShelf bookShelf(){
        BookShelf bookShelf=new BookShelf();
        return bookShelf;
    }

    @Bean
    public IBookImporter iBookImporter(){
        IBookImporter iBookImporter=new XMLBookImporter();
        return iBookImporter;

    }
}
