package algorithms.sorting.selection;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        SelectionSort sort = new SelectionSort();
        int[] sortedArray = sort.sort(unsortedArray);
        for (int element: sortedArray) {
            System.out.println(element);
        }

    }

}
