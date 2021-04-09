package algorithms.sorting.selection;

import algorithms.sorting.bubble.BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.sort(unsortedArray);
        for (int element: sortedArray) {
            System.out.println(element);
        }

    }

}
