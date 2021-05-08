package problems.covid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String virusComposition = scanner.next();
        int numOfPeople = scanner.nextInt();
        String[] peopleComposition = new String[numOfPeople];

        for(int i = 0; i < numOfPeople; i++) {

            peopleComposition[i] = scanner.next();

        }
        VirusTest test = new VirusTest();

        String[] result = test.isValidSubsequence(virusComposition, numOfPeople, peopleComposition);

        for(int i = 0; i < numOfPeople; i++) {

            System.out.println(result[i]);

        }

    }

}
