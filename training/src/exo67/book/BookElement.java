package exo67.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookElement{
    private ElementType type;
    private String title;
    private List<BookElement> elements = new ArrayList<>();

    public BookElement(ElementType type, String title) {
        this.type = type;
        this.title = title;
    }


    public BookElement(ElementType type, String title, List<BookElement> element) {
        this.type = type;
        this.title = title;
        this.elements = element;
    }


    public ElementType getType() {
        return type;
    }

    public void setType(ElementType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<BookElement> getElements() {
        return Stream.concat(elements.stream(),
                elements.stream().flatMap(element -> element.getElements().stream())).toList();



//        return elements
//
//                .stream()
//                .flatMap(element -> element.getElements().stream())
//                .collect(Collectors.toList());
    }

    public void setElements(List<BookElement> elements) {
        this.elements = elements;
    }

    public void addElement(BookElement el){
        this.elements.add(el);
    }

    @Override
    public String toString() {
        return "BookElement{" +
                "type=" + type +
                ", title='" + title + '\'' +
                '}';
    }
}
