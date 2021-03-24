package basic.stack;

public interface Stack<Item> {

    public void push(Item item);

    public Item pop();

    public boolean contains(Item item);

    public Integer size();

}
