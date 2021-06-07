package algorithms.sorting.challenge1;

import algorithms.sorting.merge.MergeSort;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        //SORT THE ARRAY IN DESCENDING ORDER
        SortingChallengeMerge mergeSort = new SortingChallengeMerge();
        int[] sortedArray = mergeSort.sort(unsortedArray, 0, unsortedArray.length);
        for (int element: sortedArray) {
            System.out.print(element+"\t");
        }

    }

}
