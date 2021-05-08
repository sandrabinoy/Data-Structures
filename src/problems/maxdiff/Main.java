package problems.maxdiff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int left = 0;
        int right = 0;
        int[] result = new int[testCases];
        for(int i = 0; i < testCases; i++) {

            left = scanner.nextInt();
            right = scanner.nextInt();

            MaxDiffPrime maxDiffPrime = new MaxDiffPrime();
            result[i] = maxDiffPrime.findMaxDifference(left, right);

        }

        for(int i = 0; i < testCases; i++) {

            System.out.println(result[i]);

        }

    }

}
