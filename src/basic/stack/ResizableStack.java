package basic.stack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ResizableStack <Item> {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private int capacity;
    private int size;
    private Item[] data;

    public ResizableStack() {

        size = 0;
        capacity = 10;
        data = (Item[]) new Object[capacity];

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void resize(int n) {

        LOGGER.log(Level.INFO, " and size=" + size);
        Item[] newArr = (Item[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = data[i];
        }
        data = newArr;

    }

    public void push(Item datum) {

        if(size == capacity) {
            LOGGER.log(Level.INFO, "Item resized to increase when capacity=" + capacity);
            resize(capacity *= 2);
        }
        data[size++] = datum;

    }

    public Item pop() {

        Item datum = data[--size];
        data[size] = null;
        if(size > 0 && size == capacity/4) {
            LOGGER.log(Level.INFO, "Item resized to decrease when capacity=" + capacity);
            resize(capacity /= 4);
        }
        return datum;

    }

}
