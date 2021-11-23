package exo55.generic3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array={"1","2","3","4","5","6","7","8"};
        System.out.println(Arrays.deepToString(array));

        GenericArray<String> genericArray = new GenericArray<>(array);

        genericArray.permutation("5","7");

        System.out.println(Arrays.deepToString(array));

    }
}
