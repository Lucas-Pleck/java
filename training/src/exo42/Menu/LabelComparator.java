package exo42.Menu;

import java.util.Comparator;

public class LabelComparator implements Comparator<MenuItem> {
    @Override
    public int compare(MenuItem o1, MenuItem o2) {
        return o1.getLabel().compareTo(o2.getLabel());
    }
}
