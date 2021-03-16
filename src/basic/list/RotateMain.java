package basic.list;

public class RotateMain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        RotateArray rotate = new RotateArray();
        int[] array = rotate.rotateArray(3, arr);
        for (int a:array
             ) {
            System.out.println(a);
        }

    }

}
