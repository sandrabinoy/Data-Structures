package data_structures.list.queues.array_queue;

import data_structures.employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sandra", "Binoy", 1);
        Employee employee2 = new Employee("Wynter", "Binoy", 2);
        Employee employee3 = new Employee("Sommer", "Binoy", 3);
        Employee employee4 = new Employee("Astrid", "Binoy", 4);
        Employee employee5 = new Employee("Liam", "IDK", 5);
        Employee employee6 = new Employee("Hannah", "Abraham", 6);
        Employee employee7 = new Employee("Susan", "Thomas", 7);
        Employee employee8 = new Employee("Venisha", "Dias", 8);
        Employee employee9 = new Employee("Tina", "Edwin", 9);
        Employee employee10 = new Employee("Priyanka", "Miranda", 10);
        Employee employee11 = new Employee("Ron", "Mathew", 11);
        Employee employee12 = new Employee("Sam", "Mathew", 12);

        ArrayQueue<Employee> queue = new ArrayQueue(10);
        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);

        //Print out the first five elements
        queue.printQueue();

        System.out.println("--------------------------------------------------");
        System.out.println("Peek:" + queue.peek());
        System.out.println("Remove:\t" + queue.remove());
        System.out.println("Peek:" + queue.peek());
        System.out.println("Remove:\t" + queue.remove());

        System.out.println("--------------------------------------------------");
        queue.printQueue();
        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee6);
        queue.add(employee7);
        queue.add(employee8);
        queue.add(employee9);
        queue.add(employee10);
        queue.add(employee11);
        queue.add(employee12);

        System.out.println("--------------------------------------------------");
        System.out.println("Peek:" + queue.peek());

        System.out.println("--------------------------------------------------");
        queue.printQueue();

    }

}
