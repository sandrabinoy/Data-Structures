package data_structures.list;

import data_structures.employee.Employee;

public class SinglyLinkedList {

    private SinglyNode<Employee> head;
    private int size = 0;

    public void add(Employee employee) {

        SinglyNode node = new SinglyNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public Employee remove() {

        if(isEmpty()) {
            return null;
        }

        SinglyNode removedNode = head;
        head = head.getNext();
        size--;
        return (Employee) removedNode.getData();

    }

    public int size() {

        return size;

    }

    public boolean isEmpty() {

        return head == null;

    }

    public void display() {

        SinglyNode current = head;
        System.out.print("Head -> ");
        while(current != null) {
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");

    }

}

class SinglyNode<Item> {

    private Item data;
    private SinglyNode next;

    public SinglyNode(Item data) {

        this.data = data;

    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
