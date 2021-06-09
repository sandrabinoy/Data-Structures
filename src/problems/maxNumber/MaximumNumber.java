package problems.maxNumber;

public class MaximumNumber {

    public int thirdMax(int[] nums) {

        int maxNum = 3;
        int maxNumIndex = 1;
        int prevValue = 0;
        for(int i = 0; i < nums.length; i++) {
            /**
             *Conditional-AND and Conditional-OR operations exhibit "short-circuiting" behavior, which means             *that the second operand is evaluated only if needed.
             */
            if(i == 0 || prevValue == nums[i]) {
                prevValue = nums[i];
                continue;
            }
            maxNumIndex++;
            System.out.println("maxNumIndex: " + maxNumIndex +
                    "\ti is: " + i);
            if(maxNumIndex == maxNum || maxNumIndex >= nums.length) {
                maxNumIndex = i;
                break;
            }

        }
        return nums[maxNumIndex];
    }

}
