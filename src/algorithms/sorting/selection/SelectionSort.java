package algorithms.sorting.selection;

public class SelectionSort {

    public int[] sort(int[] array) {

        int n = array.length;
        int smallest = 0;
        int count = 0;

        for(int i = 0; i < n-1; i++) {
            smallest = i;
            for(int j = i+1; j < n; j++) {

                if(array[j] < array[smallest]) {
                    smallest = j;
                }

            }

            if(smallest !=  i) {

                count++;
                swap(array, smallest, i);

            }

        }

        System.out.println("The count is: " + count);
        return array;

    }

    public void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
