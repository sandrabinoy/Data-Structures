package data_structures.list.queues.array_queue;

public class ArrayQueue<Item> {

    private Item[] queue;
    private int front;              //0 until data is removed
    private int back;               //size = back - front
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = (Item[]) new Object[this.capacity];
    }

    public void add(Item item) {

        if(size() == capacity - 1) {
            resizeStack(true);
        }

        queue[back] = item;

        if(back < capacity - 1) {
            back++;
        }
        else {
            back = 0;
        }

    }

    public Item remove() {
        if(isEmpty()) {
            return null;
        }

        Item item = queue[front];
        queue[front++] = null;

        if(size() == 0) {
            front = 0;
            back = 0;
        }

        return item;
    }

    public Item peek() {
        if(isEmpty()) {
            return null;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return front == back;
    }

    public int size() {
        return back - front;
    }

    public void resizeStack(boolean increaseSize) {
        if(increaseSize) {
            capacity *= 2;
            Item[] resizedStack = (Item[]) new Object[capacity];
            System.arraycopy(queue, front, resizedStack, 0, capacity - front);
            //if(front > back)
            if(front!=0) {
                System.arraycopy(queue, 0, resizedStack, capacity - front, back);
            }
            queue = resizedStack;
            front = 0;
            back = capacity;
        }
        else {
            capacity /= 4;
            Item[] resizedStack = (Item[]) new Object[capacity];
            System.arraycopy(queue, 0, resizedStack, front, capacity);
            if(front!=0) {
                System.arraycopy(queue, capacity - front, resizedStack, 0, back);
            }
            queue = resizedStack;
        }
        System.out.println("Stack resized to " + capacity);
    }

    public void printQueue() {
        for(int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
