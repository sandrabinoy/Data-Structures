package problems.maxdiff;

public class MaxDiffPrime {

    public int findMaxDifference (int left, int right) {

        int leftPrime = 0;
        int rightPrime = 0;
        int average = (right - left) / 2;

        for(int i = left; i < left+average; i=+2) {

            if(left == 2) {
                leftPrime = 2;
            }

            for (int j = 2; j * j <= i; ++j) {

                if (i % j == 0) {

                }

            }

        }

    }

}
