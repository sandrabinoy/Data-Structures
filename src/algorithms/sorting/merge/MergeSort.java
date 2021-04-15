package algorithms.sorting.merge;

public class MergeSort {

    public void mergeSort(int[] array, int start, int end) {

        if(end - start < 2)
            return;
        int mid = (start+end) / 2;
        //Left
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
    }

    public void merge(int[] array, int start, int mid, int end) {

        if(array[mid-1] <= array[mid]) {
            return;
        }

    }

}
