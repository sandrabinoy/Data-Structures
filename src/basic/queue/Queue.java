package basic.queue;

public interface Queue<Item> {

    public void enqueue(Item item);

    public Item dequeue();

    public Boolean contains(Item item);

    public Integer size();

}
