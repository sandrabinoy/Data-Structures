package algorithms.sorting.bubble;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        BubbleSort sort = new BubbleSort();
        int[] sortedArray = sort.sort(unsortedArray);
        for (int element: sortedArray) {
            System.out.println(element);
        }

    }

}
