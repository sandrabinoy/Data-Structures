package basic.list;

public class RotateArray {

    public int[] rotateArray(int d, int[] arr) {

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = 0, j = d; i < arr.length-d; i++, j++) {
            arr[i] = arr[j];
        }
        for(int i = arr.length-d, j = 0; j < d; i++, j++) {
            arr[i] = temp[j];
        }

        return arr;

    }

}
