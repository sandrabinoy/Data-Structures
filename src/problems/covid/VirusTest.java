package problems.covid;

public class VirusTest {

    public String[] isValidSubsequence(String virusComposition, int numOfPeople, String[] bloodComposition) {

        int virusCompLength = virusComposition.length();
        int bloodCompLength = 0;
        String[] result = new String[numOfPeople];

        for(int i = 0; i < numOfPeople; i++) {

            //Give the number of characters in blood composition of person i.
            bloodCompLength = bloodComposition[i].length();

            if(bloodCompLength > virusCompLength) {

                result[i] = "NEGATIVE";
                break;

            }

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

        }

        return result;

        /*int virusLength = virusComposition.length();
        int peopleLength = 0;
        boolean[] result = new boolean[numOfPeople];

        //For loop to traverse through the number of people
        for(int numberOfPeople = 0; numberOfPeople < numOfPeople; numberOfPeople++) {

            //Check if the peopleComposition (sequence) is longer than the virusComposition (array), in which case,
            //the sequence is not a subsequence of the array
            peopleLength = peopleComposition[numberOfPeople].length();
            if(peopleLength >= virusLength) {
                if(peopleLength == virusLength) {

                    result[numberOfPeople] = peopleComposition[numberOfPeople].equals(virusComposition) ? true : false;

                }
                else {

                    result[numberOfPeople] = false;

                }
                break;
            }

            //Check for each of the character in the sequence if there is a match in the array
            for(int arrComp = 0, seqComp = 0; arrComp < virusLength; arrComp++) {

                if(virusComposition.charAt(arrComp) == peopleComposition[numberOfPeople].charAt(seqComp)) {
                    if(++seqComp == peopleLength) {
                        result[numberOfPeople] = true;
                        break;
                    }
                }

            }

        }

        return result;*/

    }

}
