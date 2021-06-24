package data_structures.arrays;

public class Arrays {

    /**
     * Find the maximum of the array values
     */
    public int findMax(int[] array) {

        int maxVal = array[0];
        int arrayLength = array.length;
        int i;

        for(i = 1; i < arrayLength; i++) {

            if(array[i] > maxVal) {

                maxVal = array[i];

            }

        }

        return maxVal;

    }

    /**
     * Find average of the array values
     */
    public double findAverage(int[] array) {

        double average = 0.0;
        int sum = 0;
        int arrayLength = array.length;

        for(int i = 0; i < arrayLength; i++) {

            sum += array[i];

        }

        average = (double) sum / arrayLength;
        return average;

    }

    /**
     * Copy to another array
     */
    public void copyArray(int[] array) {

        int arrayLength = array.length;
        int[] copiedArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {

            copiedArray[i] = array[i];
            System.out.print(copiedArray[i] + " ");

        }
        System.out.println();

    }

    /**
     * Reverse elements in an array
     */
    public int[] reverseArray(int[] array) {

        int arrayLength = array.length;

        for(int i = 0, j = arrayLength - 1; i < arrayLength / 2; i++, j--) {

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }

        return array;

    }

    /**
     * Multiply square matrix
     */
    public int[][] multiplySquareMatrix(int[][] matrixOne, int[][] matrixTwo) {

        int m = matrixOne.length;
        int[][] resultantMatrix = new int[m][m];
        int i = 0, j = 0, k = 0;

        for(i = 0; i < m; i++) {

            for(j = 0; j < m; j++) {

                for(k = 0; k < m; k++) {

                    resultantMatrix[i][j] += matrixOne[i][k] * matrixTwo[k][j];

                }

            }

        }

        return resultantMatrix;

    }

}
