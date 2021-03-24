package basic.stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new ResizableStack<>();

        int n = 15;
        for(int i = 0; i < n; i++) {
            stack.push(i);
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }

    }

}
