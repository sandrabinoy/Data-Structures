package algorithms.challenges.insertion;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        InsertionWithRecursion sort = new InsertionWithRecursion();
        int[] sortedArray = sort.sort(unsortedArray, 1);
        for (int element: sortedArray) {
            System.out.println(element);
        }

    }

}
