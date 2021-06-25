package algorithms.searching.binary;

public class BinarySearch {

    public int search(int[] array, int element) {

        int left = 0;
        int right = array.length;

        while(left < right) {

            int mid = (left + right) / 2;
            System.out.println("Mid-point: " + mid);

            if(array[mid] == element) {
                return mid;
            }
            else if(element < array[mid]) {
                right = mid;
            }
            else if(element > array[mid]) {
                left = mid + 1;
            }

        }

        return -1;

    }

    public int recursiveSearch(int[] array, int element, int left, int right) {

        if(left >= right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if(array[mid] == element) {
            return mid;
        }
        else if(element > array[mid]) {
            return recursiveSearch(array, element, mid+1, right);
        }
        else {
            return recursiveSearch(array, element, left, mid);
        }

    }

}
