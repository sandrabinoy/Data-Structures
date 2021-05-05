package problems.sequencecheating;

import java.util.List;

public class SequenceCheating {

    public Long removedNumber(long n) {

        long summation = n * (1 + n) / 2;
        System.out.println(summation);
        return summation;

    }

}
