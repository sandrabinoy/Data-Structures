package basic.queue;

public class BasicQueue<Item> implements Queue<Item> {

    private Item[] data;
    private Integer front;
    private Integer rear;

    public BasicQueue() {
        this(100);
    }

    public Boolean isEmpty() {
        return rear == front;
    }

    public BasicQueue(int capacity) {
        front = 0;
        rear = 0;
        data = (Item[]) new Object[capacity];
    }

    @Override
    public void enqueue(Item item) {

        data[rear++] = item;

    }

    @Override
    public Item dequeue() {
        if(!isEmpty())
            throw new IllegalStateException("There are no elements in the Queue to pop");
        return data[front++];
    }

    @Override
    public Boolean contains(Item item) {
        boolean found = false;
        for(int i = front; i < rear; i++) {
            if(data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public Integer size() {
        return rear;
    }

}
