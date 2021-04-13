package algorithms.sorting.shell;

import algorithms.sorting.insertion.InsertionSort;

import static java.lang.System.*;

public class ShellSorting {

    public int[] sort(int[] array) {

        int n = array.length;

        for(int gap = n/2; gap > 0; gap/=2) {

            for(int i = gap; i < n; i++) {

                int temp = array[i];
                int j = i;

                while(j >= gap && array[j - gap] > temp) {

                    array[j] = array[j-gap];
                    j -= gap;

                }

                array[j] = temp;

            }

        }

        return array;

    }

}
