package algorithms.sorting.merge;

public class MergeSort {

    public int[] sort(int[] array, int start, int end) {

        if(end - start < 2) {
            return null;
        }
        int mid = (start+end) / 2;
        //Left
        sort(array, start, mid);
        sort(array, mid, end);
        return merge(array, start, mid, end);
    }

    public int[] merge(int[] array, int start, int mid, int end) {

        if(array[mid-1] <= array[mid]) {
            return null;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i<mid && j < end) {

            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];

        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

        return array;

    }

}
