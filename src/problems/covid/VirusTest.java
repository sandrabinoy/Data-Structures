package problems.covid;

public class VirusTest {

    /**
     * Time complexity:
     * Number Of People (The total number of test cases) if considered 1, then
     * O(n) is the time complexity where n is the number of characters in the String virusComposition.
     */
    public String[] isValidSubsequence(String virusComposition, int numOfPeople, String[] bloodComposition) {

        int virusCompLength = virusComposition.length();
        int bloodCompLength = 0;
        String[] result = new String[numOfPeople];

//        int virusCompIndex = 0;
//        int bloodCompIndex = 0;

        for(int i = 0; i < numOfPeople; i++) {

            //Give the number of characters in blood composition of person i.
            bloodCompLength = bloodComposition[i].length();

            //If the length of the sequence is greater than what it's being compared with, then it's not going to be a subsequence of it, to begin with
            if(bloodCompLength > virusCompLength) {

                result[i] = "NEGATIVE";
                break;

            }

            //Checking if the sequence (bloodComposition) is a subsequence of the larger sequence (virusComposition)
            for(int j = 0, k = 0; j < virusCompLength; j++) {

                if(virusComposition.charAt(j) == bloodComposition[i].charAt(k)) {

                    if(++k == bloodCompLength) {

                        result[i] = "POSITIVE";
                        break;

                    }

                }
                if (j == virusCompLength-1 && result[i] == null) {
                    result[i] = "NEGATIVE";
                }

            }

            /**
             * An alterantive to using the for loop is to use the while loop:
             */

            /*
            while(virusCompIndex < virusCompLength && bloodCompIndex < bloodCompLength) {

                if(virusComposition.charAt(virusCompIndex) == bloodComposition[i].charAt(bloodCompIndex)) {
                    bloodCompIndex++;
                }
                virusCompIndex++;

            }

            result[i] = bloodCompIndex == bloodCompLength ? "POSITIVE" : "NEGATIVE";*/

        }

        return result;

    }

}
