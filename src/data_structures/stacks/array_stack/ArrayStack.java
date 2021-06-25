package data_structures.stacks.array_stack;

public class ArrayStack<Item> {

    private Item[] stack;
    private int top;
    private int size = 0;
    private int capacity;

    public ArrayStack(int capacity) {
        this.stack = (Item[]) new Object[capacity];
    }

    public void push(Item item) {

        if(this.size == this.capacity) {
            resizeStack(true);
            Item[] resizedStack = (Item[]) new Object[capacity];
            System.arraycopy(stack, 0, resizedStack, 0, size);
            stack = resizedStack;
        }

    }

    public void resizeStack(boolean increaseSize) {
        if(increaseSize) {
            capacity *= 2;
        }
        else {
            capacity /= 4;
        }
    }

}
