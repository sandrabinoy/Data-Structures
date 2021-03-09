package basic.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ResizableQueue <Item> {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private int capacity;
    private int front;
    private int rear;
    private Item[] data;

    public ResizableQueue() {
        capacity = 16;
        front = 0;
        rear = 0;
        data = (Item[]) new Object[capacity];
    }

    public int size() {
        return rear;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public void resize() {
        LOGGER.log(Level.INFO, " and size=" + rear);
        Item[] newArr = (Item[]) new Object[capacity];
        for(int i = 0; i < rear; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public void enqueue(Item datum) {
        if(rear == capacity) {
            LOGGER.log(Level.INFO, "Item resized to increase when capacity=" + capacity);
            capacity *= 2;
            resize();
        }
        data[rear++] = datum;
    }

    public Item dequeue() {
        Item datum = data[front];
        data[front++] = null;
        if(rear > 0 && rear == capacity/4) {
            LOGGER.log(Level.INFO, "Item resized to decrease when capacity=" + capacity);
            capacity /= 4;
            resize();
        }
        return datum;
    }

}
