package exo41.Zoo;

import java.util.Comparator;

public class NameComparator implements Comparator<Animals>{


    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
