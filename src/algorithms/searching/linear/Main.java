package algorithms.searching.linear;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 6, 55, 1, -22};

        LinearSearch linearSearch = new LinearSearch();
        System.out.println("Element found at index: " + linearSearch.search(array, 82));

    }

}
