package basic.stack;

public class StackMain {

    Stack<String> stack = new ResizableStack<>();

    public static void main(String[] args) {
        


    }
    
    public void stacking() {

        /**
         * Spades
         */
        stack.push("Ace of Spade");
        stack.push("2 of Spade");
        stack.push("3 of Spade");
        stack.push("4 of Spade");
        stack.push("5 of Spade");
        stack.push("6 of Spade");
        stack.push("7 of Spade");
        stack.push("8 of Spade");
        stack.push("9 of Spade");
        stack.push("10 of Spade");
        stack.push("Jack of Spade");
        stack.push("Queen of Spade");
        stack.push("Kind of Spade");

        /**
         * Diamonds
         */
        stack.push("Ace of Diamond");
        stack.push("2 of Diamond");
        stack.push("3 of Diamond");
        stack.push("4 of Diamond");
        stack.push("5 of Diamond");
        stack.push("6 of Diamond");
        stack.push("7 of Diamond");
        stack.push("8 of Diamond");
        stack.push("9 of Diamond");
        stack.push("10 of Diamond");
        stack.push("Jack of Diamond");
        stack.push("Queen of Diamond");
        stack.push("Kind of Diamond");

        /**
         * Hearts
         */
        stack.push("Ace of Heart");
        stack.push("2 of Heart");
        stack.push("3 of Heart");
        stack.push("4 of Heart");
        stack.push("5 of Heart");
        stack.push("6 of Heart");
        stack.push("7 of Heart");
        stack.push("8 of Heart");
        stack.push("9 of Heart");
        stack.push("10 of Heart");
        stack.push("Jack of Heart");
        stack.push("Queen of Heart");
        stack.push("Kind of Heart");

        /**
         * Clubs
         */
        stack.push("Ace of Clubs");
        stack.push("2 of Clubs");
        stack.push("3 of Clubs");
        stack.push("4 of Clubs");
        stack.push("5 of Clubs");
        stack.push("6 of Clubs");
        stack.push("7 of Clubs");
        stack.push("8 of Clubs");
        stack.push("9 of Clubs");
        stack.push("10 of Clubs");
        stack.push("Jack of Clubs");
        stack.push("Queen of Clubs");
        stack.push("Kind of Clubs");

    }

    public void unstacking() {

        stack.pop();

    }

}
