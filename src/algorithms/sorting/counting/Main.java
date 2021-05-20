package algorithms.sorting.counting;

import algorithms.sorting.bubble.BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 5, 3};
        //2, 2, 3, 4, 5, 5, 7, 8, 8, 9, 10

        CountingSort sort = new CountingSort();
        int[] sortedArray = sort.sort(unsortedArray);
        for (int element: sortedArray) {
            System.out.println(element);
        }

    }

}
