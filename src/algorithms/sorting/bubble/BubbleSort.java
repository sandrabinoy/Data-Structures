package algorithms.sorting.bubble;

public class BubbleSort {

    public int[] sort(int[] array) {

        int n = array.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(array[j] > array[j+1]) {

                    swap(array, j, j+1);

                }
            }
        }

        return array;
    }

    public void swap(int[] array, int i, int j) {

        if(i == j) {

            return;

        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
