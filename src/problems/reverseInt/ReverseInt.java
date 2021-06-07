package problems.reverseInt;
import java.util.*;

public class ReverseInt {

    public int reverse(int x) {
        return (x == 0) ? 0 : process(x, 0);
    }

    private int process(int x, int output) {
        if (output < Integer.MIN_VALUE/10 || output > Integer.MAX_VALUE/10)
            return 0;
        else if (x/10 == 0)
            return (output * 10) + (x % 10);
        else
            return process(x/10, (output * 10) + x % 10);
    }

    /*public int reverseInteger(int x) {

        StringBuffer numberString = new StringBuffer();
        Long reversedNumber = 0l;
        Boolean isNegative = false;
        Stack<Long> stack = new Stack<Long>();
        if(x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        while(x != 0) {
            stack.push(Long.valueOf(x % 10));
            x /= 10;
            numberString.append(Long.toString(stack.pop()));
            System.out.println(numberString);
        }
        reversedNumber = Long.parseLong(numberString.toString());
        System.out.println(reversedNumber);

        if (reversedNumber >= Math.pow(31, -2) && reversedNumber <= (Math.pow(31, 2)) - 1) {
            if(isNegative) {
                reversedNumber *= -1;
                System.out.println(reversedNumber);
            }
            return reversedNumber.intValue();
        }
        else {
            return 0;
        }


    }*/

}
