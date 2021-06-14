package algorithms.challenges.insertion;

public class InsertionWithRecursion {

    public int[] sort(int[] array, int keyIndex) {

        int key = array[keyIndex];

        if(keyIndex == array.length) {
            return array;
        }

        for(int i = 0; i < keyIndex; i++) {

            if(key < array[i]) {

                int temp = array[i];
                array[i] = key;
                key = temp;

            }

            array[i] = key;

        }

        keyIndex++;

        return sort(array, keyIndex);

    }

}
