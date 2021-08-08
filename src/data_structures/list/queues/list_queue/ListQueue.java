package data_structures.list.queues.list_queue;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListQueue<Item> {

    private LinkedList<Item> queue;

    public ListQueue() {
        queue = new LinkedList<Item>();
    }

    public void add(Item item) {
        queue.add(item);
    }

    public Item remove() {
        return queue.remove();
    }

    public Item peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        ListIterator iterator = queue.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
