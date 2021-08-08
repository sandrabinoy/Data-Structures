package data_structures.stacks.array_stack;

public class ArrayStack<Item> {

    private Item[] stack;
    private int top = 0;
    private int capacity;

    public ArrayStack(int capacity) {

        this.capacity = capacity;
        this.stack = (Item[]) new Object[this.capacity];

    }

    public void push(Item item) {

        if(this.top == this.capacity) {
            resizeStack(true);
        }

        stack[top++] = item;

    }

    public Item pop() {
        if(isEmpty()) {
            return null;
        }

//        if(this.top == capacity/4) {
//            resizeStack(false);
//        }

        Item item = stack[--top];
        System.out.println("Popping element:\t" + item);
        stack[top] = null;
        return item;
    }

    public Item peek() {
        if(isEmpty()) {
            return null;
        }

        return stack[top-1];
    }

    public int size() {
        return top;
    }

    public void resizeStack(boolean increaseSize) {
        if(increaseSize) {
            capacity *= 2;
            Item[] resizedStack = (Item[]) new Object[capacity];
            System.arraycopy(stack, 0, resizedStack, 0, top);
            stack = resizedStack;
            System.out.println("Stack resized to " + capacity);
        }
        else {
            capacity /= 4;
            Item[] resizedStack = (Item[]) new Object[capacity];
            System.arraycopy(stack, 0, resizedStack, 0, top);
            stack = resizedStack;
            System.out.println("Stack resized to " + capacity);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack () {
        for(int i = top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
