package data_structures.list;

import data_structures.employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee sandra = new Employee("Sandra", "Binoy", 001);
        Employee wynter = new Employee("Wynter", "Binoy", 002);
        Employee sommer = new Employee("Sommer", "Binoy", 003);
        Employee astrid = new Employee("Astrid", "Binoy", 004);

        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Empty list: " + list.isEmpty());

        list.add(sandra);
        list.add(wynter);
        list.add(sommer);
        list.add(astrid);

        System.out.println("List size: " + list.size());

        list.display();

        System.out.println("Removed node: " + list.remove());
        list.display();

    }

}
