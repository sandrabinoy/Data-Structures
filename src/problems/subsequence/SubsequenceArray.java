package problems.subsequence;

import java.util.List;

public class SubsequenceArray {

    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int n = array.size();
        int m = sequence.size();

        //Check if each of the elements in the sequence is equal to the ones in the array
        for(int i = 0, j = 0; i < n; i++) {
            if(array.get(i) == sequence.get(j)) {
                if(++j == m) {
                    return true;
                }
            }
        }

        return false;

    }

}
