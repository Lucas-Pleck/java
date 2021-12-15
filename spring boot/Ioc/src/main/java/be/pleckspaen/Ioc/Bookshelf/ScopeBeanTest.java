package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScopeBeanTest {

    @Autowired
    public ScopeBeanTest(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        System.out.println("Bean Memory Address "+bookShelf);
    }

    private BookShelf bookShelf;
}
