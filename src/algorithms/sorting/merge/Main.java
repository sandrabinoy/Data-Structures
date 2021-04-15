package algorithms.sorting.merge;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.merge(unsortedArray, 0, unsortedArray.length);
        for (int element: sortedArray) {
            System.out.print(element+"\t");
        }

    }

}
