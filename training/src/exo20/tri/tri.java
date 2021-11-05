package exo20.tri;

import java.util.Arrays;
import java.util.Collections;

public class tri {

    public static void main(String[] args) {
        int[] table = {4, 2, 5, 8, 6};
        boolean isValidIncreaseSort = true;
        boolean isValidDecreaseSort = true;

        for (int i = 0; i < table.length - 1; i++) {
            if (!(isValidIncreaseSort && table[i] < table[i + 1])) {
                isValidIncreaseSort = false;
            }
            if (!(isValidDecreaseSort && table[i] > table[i + 1])) {
                isValidDecreaseSort = false;
            }
        }
        if (isValidIncreaseSort) {
            System.out.println("sorted Increase");
        } else if (isValidDecreaseSort) {
            System.out.println("sorted Decrease");
        } else {
            System.out.println("Not sorted");
        }

    }
}
