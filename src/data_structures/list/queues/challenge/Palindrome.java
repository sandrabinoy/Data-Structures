package data_structures.list.queues.challenge;

import data_structures.employee.Employee;
import data_structures.list.queues.list_queue.ListQueue;
import data_structures.stacks.list_stack.ListStack;

public class Palindrome {

    public static void main(String[] args) {

        String string1 = "I did, did I?";
        String string2 = "Just a phrase";
        String string3 = "Malayalam";
        String string4 = "Was it a car or a cat I saw?";
        String string5 = "I am not a palindrome";

        //Check if string is Palindrome
        System.out.println(isPalindrome(string1.toLowerCase()));    // true
        System.out.println(isPalindrome(string2.toLowerCase()));    // false
        System.out.println(isPalindrome(string3.toLowerCase()));    // true
        System.out.println(isPalindrome(string4.toLowerCase()));    // true
        System.out.println(isPalindrome(string5.toLowerCase()));    // false

    }

    public static boolean isPalindrome(String input) {

        ListQueue<Character> queue = new ListQueue<>();
        ListStack<Character> stack = new ListStack<>();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z'){
                queue.add(c);
                stack.push(c);
            }
        }

        while(!queue.isEmpty()) {

            if(!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

//        return string.toString().equals(reversedString.toString());
        return true;

    }

}
