package exo53.generic;

public class GenericContainer<E> {
   private E e;

    public GenericContainer(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
