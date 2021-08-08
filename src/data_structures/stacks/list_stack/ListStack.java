package data_structures.stacks.list_stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListStack<Item> {

    private LinkedList<Item> stack;

    public ListStack() {

        stack = new LinkedList<Item>();

    }

    public void push(Item item) {
        stack.push(item);
    }

    public Item peek() {
        return stack.peek();
    }

    public Item pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Item> iterator = stack.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
