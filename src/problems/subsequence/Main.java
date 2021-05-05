package problems.subsequence;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SubsequenceArray subsequenceArray = new SubsequenceArray();
        List<Integer> array = Arrays.asList(5, 1, 15, 3, 12, 28, -1, 6, 8, 22, 10);
        List<Integer> sequence = Arrays.asList(1, 3, -1, 10);
        System.out.println(subsequenceArray.isValidSubsequence(array, sequence));

    }

}
