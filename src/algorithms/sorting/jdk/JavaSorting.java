package algorithms.sorting.jdk;

import java.util.Arrays;

public class JavaSorting {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 6, 55, 1, -22};

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
