package data_structures.list;

import data_structures.employee.Employee;

public class SinglyLinkedList {

    private Node<Employee> head;

}

class Node<Item> {

    private Item data;
    private Node next;

    public Node(Item data) {

        this.data = data;

    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
