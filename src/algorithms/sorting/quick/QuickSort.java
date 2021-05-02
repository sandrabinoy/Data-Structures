package algorithms.sorting.quick;

public class QuickSort {

    public int[] sort(int[] array, int start, int end) {

        if((end-start) < 2) {
            return null;
        }

        int pivotIndex = partition (array, start, end);
        sort(array, start, pivotIndex);
        sort(array, pivotIndex+1, end);

        return array;

    }

    public int partition (int[] array, int start, int end) {
        //This is using the first element as the pivot

        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {

            //NOTE: Empty loop body
            while (i < j && array[--j] >= pivot);
            if(i < j) {
                array[i] = array[j];
            }

            //NOTE: Empty loop body (LEFT -> RIGHT)
            while (i < j && array[++i] <= pivot);
            if(i < j) {
                array[j] = array[i];
            }

        }

        array[j] = pivot;
        return j;

    }

}
