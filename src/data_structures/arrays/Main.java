package data_structures.arrays;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = {10, 2, 16, 29, 62, 21, 32, 12, 91, 64, 78, 50};
        int m = 4;
        int[][] matrixOne = new int[m][m];
        int[][] matrixTwo = new int[m][m];
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < m; j++) {

                matrixOne[i][j] = random.nextInt(10);
                matrixTwo[i][j] = random.nextInt(10);

            }

        }

        int[] extraArray = new int[array.length];
        Arrays classArray = new Arrays();

        //Find the maximum value in an array
        System.out.println(classArray.findMax(array));

        //Find the average of values in an array
        System.out.println(classArray.findAverage(array));

        //Copy elements in an array
        classArray.copyArray(array);

        //Reverse elements in an array
        extraArray = classArray.reverseArray(array);
        for(int element: extraArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Square matrix multiplication
        int[][] resultantMatrix = new int[m][m];
        resultantMatrix = classArray.multiplySquareMatrix(matrixOne, matrixTwo);
        System.out.println("Matrix One: ");
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < m; j++) {

                System.out.print(matrixOne[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("Matrix Two: ");
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < m; j++) {

                System.out.print(matrixTwo[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("Resultant matrix: ");
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < m; j++) {

                System.out.print(resultantMatrix[i][j] + " ");

            }
            System.out.println();

        }

    }

}
