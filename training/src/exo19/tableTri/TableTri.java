package exo19.tableTri;

import java.util.Arrays;

public class TableTri {
    public static void main(String[] args) {
        int[] tab1 = {4, 2, 8, 9, 1, 7};
        int[] tab2 = {11, 65, 87, 12, 45, 36};
        tab1=tri(tab1);
        tab2=tri(tab2);

        int len1 = tab1.length;
        int len2 = tab2.length;

        int[] tab3 = new int[len1 + len2];

        System.arraycopy(tab1, 0, tab3, 0, len1);
        System.arraycopy(tab2, 0, tab3, len1, len2);
        System.out.println(Arrays.toString(tab3));
    }

    private static int[] tri(int[] tableau) {
        int i, j, key;

        for (i = 1; i < tableau.length; i++) {
            key = tableau[i];
            j = i;
            while ((j >= 1) && (tableau[j - 1] > key)) {
                tableau[j] = tableau[j - 1];
                j = j - 1;
            }
            tableau[j] = key;
        }
        return tableau;
    }
}
