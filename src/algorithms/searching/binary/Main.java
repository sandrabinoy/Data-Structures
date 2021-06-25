package algorithms.searching.binary;

import algorithms.searching.linear.LinearSearch;
import algorithms.sorting.quick.QuickSort;

public class Main {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] array = {20, 35, -15, 6, 55, 1, -22};
        int[] sortedArray = quickSort.sort(array, 0, array.length);
        //-22, -15, 1, 6, 20, 35, 55

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Element found at index: " + binarySearch.search(array, 20));
        System.out.println("Element found at index: " + binarySearch.search(array, 123));
        System.out.println("Element found at index: " + binarySearch.search(array, -15));
        System.out.println("Element found at index: " + binarySearch.search(array, 6));


        //Recursive
        System.out.println("Recursive: ");
        System.out.println("Element found at index: " + binarySearch.recursiveSearch(array, 20, 0, array.length));
        System.out.println("Element found at index: " + binarySearch.recursiveSearch(array, 213, 0, array.length));
        System.out.println("Element found at index: " + binarySearch.recursiveSearch(array, -12, 0, array.length));
        System.out.println("Element found at index: " + binarySearch.recursiveSearch(array, 1, 0, array.length));

    }

}
