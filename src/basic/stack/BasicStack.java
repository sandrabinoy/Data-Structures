package basic.stack;

public class BasicStack<Item> implements Stack<Item> {

    private Item[] data;
    private Integer capacity;
    private Integer size;                   //STACK POINTER

    public BasicStack() {
        size = 0;
        capacity = 100;
        data = (Item[]) new Object[capacity];
    }

    @Override
    public void push(Item item) {

        data[size++] = (Item) item;

    }

    public Item pop() {
        if(size == 0)
            throw new IllegalStateException("There are no items in the stack currently");
        return data[--size];
    }

    public boolean contains(Item item) {
        boolean found = false;
        for(int i = 0; i < size; i++) {
            if(data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public Item Access(Item item) {

        while(size > 0) {
            Item temp = pop();
            if(temp.equals(item))
                return temp;
        }

        throw new IllegalStateException("Could not find item on the stack");

    }

    public Integer size() {
        return size;
    }

}
