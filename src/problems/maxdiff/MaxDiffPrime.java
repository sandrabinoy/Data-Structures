package problems.maxdiff;

public class MaxDiffPrime {

    /**
     *
     * @param left
     * @param right
     * @return
     */
    public int findMaxDifference (int left, int right) {


        int maxDiff = -1;
        int leftPrime = findNearestPrime(left, right, true);
        int rightPrime = findNearestPrime(left, right, false);

        System.out.println("Left Prime: "+leftPrime + "\tRight Prime: "+rightPrime);
        if(leftPrime == 0) {
            if(rightPrime == 0) {
                return maxDiff;
            }
        }

        else {
            if(leftPrime == rightPrime) {
                return maxDiff = 0;
            }

            else {
                maxDiff = rightPrime - leftPrime;
            }
        }

        return maxDiff;

    }

    public int findNearestPrime (int left, int right, boolean fromLeft) {

        int primeNumber = 0;
        int flag = -1;

        //Go from left to right
        if(fromLeft == true) {
            //If left is 2, which is the only even prime number
            if(left == 2) {
                return primeNumber = left;
            }

            //Making sure that the left is an odd number, else incrementing
            if(left%2 == 0) {
                ++left;
            }

            for(int leftIndex = left; leftIndex <= right; leftIndex+=2) {
                flag = 1;
                for(int j = 2; j*j <= leftIndex; ++j) {
                    if(leftIndex % j == 0) {
                        flag = 0;
                        break;
                    }
                }

                if(flag == 1) {
                    return primeNumber = leftIndex;
                }
            }
        }

        //Go from right to left
        else {
            if(right%2 == 0) {
                --right;
            }

            for(int rightIndex = right; rightIndex >= left; rightIndex-=2) {
                flag = 1;
                for(int j = 2; j*j <= rightIndex; ++j) {
                    if(rightIndex % j == 0) {
                        flag = 0;
                        break;
                    }
                }

                if(flag == 1) {
                    return primeNumber = rightIndex;
                }

            }

        }

        return primeNumber;

    }

}
