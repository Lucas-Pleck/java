package exo67.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Book {
    private List<BookElement> element =new ArrayList<>();

    public Book(List<BookElement> element) {
        this.element = element;
    }

    public Book() {

    }

    public List<BookElement> getElements() {
        return Stream.concat(element.stream(),element.stream().flatMap(el -> el.getElements().stream())).toList();


//       return element
//                .stream()
//                .flatMap(el -> el.getElements().stream())
//                .collect(Collectors.toList());
    }

    public void setElements(List<BookElement> element) {
        this.element = element;
    }

    public void addBookElements( BookElement element) {
        this.element.add(element);
    }

    @Override
    public String toString() {
        return "Book{" +
                "element=" + element +
                '}';
    }
}
