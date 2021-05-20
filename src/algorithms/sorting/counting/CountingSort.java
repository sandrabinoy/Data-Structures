    package algorithms.sorting.counting;

    public class CountingSort {

        public int[] sort(int[] array) {

            //To find the range of the array
            int[] range = findRange(array);

            //To find the count of each element in the array
            int[] countArray = findCount(array, range[1]);

            int[] sortedArray = new int[array.length];
            for(int i = 0, j = 0; i < countArray.length; i++) {

                    while(countArray[i] != 0) {
                        sortedArray[j++] = i + 1;
                        --countArray[i];
                    }

            }

            return sortedArray;

        }

        public int[] findRange(int[] array) {

            int[] range = {array[0], array[0]};
            for(int i = 0; i < array.length; i++) {
                if(array[i] < range[0]) {
                    range[0] = array[i];
                }
                if(array[i] > range[1]) {
                    range[1] = array[i];
                }
            }

            return range;
        }

        public int[] findCount(int[] array, int maxValue) {

            int length = array.length;
            int[] countArray = new int[maxValue];
            for(int i = 0; i < length; i++) {

                countArray[array[i] - 1]++;

            }

            return countArray;

        }

    }
