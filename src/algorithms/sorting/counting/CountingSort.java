    package algorithms.sorting.counting;

    public class CountingSort {

        public int[] sort(int[] array) {

            //To find the range of the array
            int[] range = findRange(array);

            //To find the count of each element in the array
            int minValue = range[0];
            int maxValue = range[1];
            int[] countArray = findCount(array, minValue, maxValue);

            int[] sortedArray = new int[array.length];
            for(int i = 0, j = 0; i < countArray.length; i++) {

                    while(countArray[i] != 0) {
                        sortedArray[j++] = i + minValue;
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

        public int[] findCount(int[] array, int minValue, int maxValue) {

            int length = array.length;
            int[] countArray = new int[(maxValue - minValue) + 1];
            for(int i = 0; i < length; i++) {

                countArray[array[i] - minValue]++;

            }

            return countArray;

        }

    }
