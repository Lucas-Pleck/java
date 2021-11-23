package exo54.generic2;

import java.util.Objects;

public class CompositeKey<E,F> {
    private E firstKey;
    private F secondKey;

    public CompositeKey(E firstKey, F secondKey) {
        this.firstKey = firstKey;
        this.secondKey = secondKey;
    }

    public E getFirstKey() {
        return firstKey;
    }

    public void setFirstKey(E firstKey) {
        this.firstKey = firstKey;
    }

    public F getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(F secondKey) {
        this.secondKey = secondKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKey<?, ?> that = (CompositeKey<?, ?>) o;
        return Objects.equals(firstKey, that.firstKey) && Objects.equals(secondKey, that.secondKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstKey, secondKey);
    }

    @Override
    public String toString() {
        return "CompositeKey{" +
                "firstKey=" + firstKey +
                ", secondKey=" + secondKey +
                '}';
    }
}
