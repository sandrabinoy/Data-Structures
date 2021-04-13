package algorithms.sorting.shell;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 6, 55, 1, -22};

        ShellSorting sort = new ShellSorting();
        int[] sortedArray = sort.sort(unsortedArray);
        for (int element: sortedArray) {
            System.out.print(element+"\t");
        }

    }

}
