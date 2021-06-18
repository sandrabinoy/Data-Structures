package algorithms.challenges.insertion;

public class InsertionWithRecursion {

    int iteration = 1;
    int iVal = 0;

    // A method is a recursive method when it calls itself.
    public int[] sort(int[] array, int keyIndex) {

        int key = array[keyIndex];
        boolean isSwapping = false;

        if (keyIndex == array.length) {
            return array;
        }

        for (int i = keyIndex-1; i >= 0; i--) {

            System.out.print("Iteration: "+ iteration + "\ti: " + i + "\tKeyIndex: " + keyIndex + "\t Key: " + key);

            if (key < array[i]) {
                isSwapping = true;
                System.out.print("\tElements: " + array[i] + " to " + array[i+1]);
                array[i+1] = array[i];
                System.out.print("\tSwapping: " + isSwapping + "\n");
            }
            else if (key >= array[i] && i == 0) {

                array[iVal] = key;
                System.out.println();
                break;

            }

        }

        for(int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();

        ++iteration;

        if(++keyIndex == array.length) {
            return array;
        }
        return sort(array, keyIndex);
    }

}
