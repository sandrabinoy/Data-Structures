package data_structures.stacks.challenge;

import data_structures.stacks.list_stack.ListStack;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {

        String string1 = "I did, did I?";
        String string2 = "Just a phrase";
        String string3 = "Malayalam";
        String string4 = "Was it a car or a cat I saw?";
        String string5 = "I am not a palindrome";

        //Check if string is Palindrome
        System.out.println(isPalindrome(string1.toLowerCase()));
        System.out.println(isPalindrome(string2.toLowerCase()));
        System.out.println(isPalindrome(string3.toLowerCase()));
        System.out.println(isPalindrome(string4.toLowerCase()));
        System.out.println(isPalindrome(string5.toLowerCase()));

    }

    public static boolean isPalindrome(String string) {

        ListStack<Character> stack = new ListStack<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverseString = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c >= 'a' && c <='z') {
                stringBuilder.append(c);
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return stringBuilder.toString().equals(reverseString.toString());

    }

}
