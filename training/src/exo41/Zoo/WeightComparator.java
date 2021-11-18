package exo41.Zoo;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animals>{


    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
