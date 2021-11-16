package exo40.collections;

import java.util.Comparator;

public class FirstnameComparator implements Comparator<Personne>{
        @Override
        public int compare(Personne o1, Personne o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
