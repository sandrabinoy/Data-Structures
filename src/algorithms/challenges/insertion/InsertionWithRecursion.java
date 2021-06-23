package algorithms.challenges.insertion;

public class InsertionWithRecursion {

    // A method is a recursive method when it calls itself.
    public int[] sort(int[] array, int numOfItems) {

        if(numOfItems < 2) {
            return array;
        }

        sort(array, numOfItems - 1);

        int key = array[numOfItems - 1];

        int i;

        for(i = numOfItems - 1; i > 0 && array[i-1] > key; i--) {
            array[i] = array[i-1];
        }

        array[i] = key;

        System.out.println("Result of call when number of items = " + numOfItems);
        for(i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println("");
        System.out.println("-------------------------------------------------");

        return array;

    }

}
