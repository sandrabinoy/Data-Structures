package algorithms.searching.linear;

public class LinearSearch {

    public int search(int[] array, int element) {

        int length = array.length;

        for(int i = 0; i < length; i++) {

            if(array[i] == element) {
                return i;
            }

        }

        return -1;

    }

}
