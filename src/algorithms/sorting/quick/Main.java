package algorithms.sorting.quick;

import algorithms.sorting.merge.MergeSort;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.sort(unsortedArray, 0, unsortedArray.length);
        for (int element: sortedArray) {
            System.out.print(element+"\t");
        }

    }

}
