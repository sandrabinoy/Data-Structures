package basic.test;

import java.util.Scanner;

public class Number42 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        /**
         * //Delimiting with Scanner
         *         Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
         */


        while(scan.hasNext()) {
            number = scan.nextInt();
            if(number == 42)
                break;
            System.out.println(number);
        }

    }

}
