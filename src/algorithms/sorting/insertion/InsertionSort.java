package algorithms.sorting.insertion;

public class InsertionSort {

    public int[] sort(int[] array) {

        int n = array.length;
        int temp = 0;

        for (int i = 1; i < n; i++) {

            temp = array[i];
            int j = 0;

            for (j = i; j > 0 && temp < array[j-1]; j--) {

                array[j] = array[j-1];

            }
            array[j] = temp;

        }

        return array;

    }

}
