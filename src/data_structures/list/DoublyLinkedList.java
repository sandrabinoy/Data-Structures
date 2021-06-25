package data_structures.list;

import data_structures.employee.Employee;

public class DoublyLinkedList {

    private DoublyNode<Employee> head;
    private int size = 0;

    private void add(Employee employee) {

        DoublyNode node = new DoublyNode(employee);
        node.setPrev(null);
        node.setNext(head);
        head = node;
        size++;

    }

}

class DoublyNode<Item> {

    private Item data;
    private DoublyNode<Item> prev;
    private DoublyNode<Item> next;

    public DoublyNode(Item data) {

        this.data = data;

    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public DoublyNode<Item> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<Item> prev) {
        this.prev = prev;
    }

    public DoublyNode<Item> getNext() {
        return next;
    }

    public void setNext(DoublyNode<Item> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
