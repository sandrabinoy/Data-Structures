package data_structures.stacks.array_stack;

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


        ArrayStack<Employee> stack = new ArrayStack<>(10);
        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.push(employee4);
        stack.push(employee5);

        System.out.println("Printing stack after first push");
        stack.printStack();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Peek:\n" + stack.peek());

        System.out.println("------------------------------------------------------------------");
        System.out.println("Printing stack after peek");
        stack.printStack();

        System.out.println("------------------------------------------------------------------");
        System.out.println("First pop:\n" + stack.pop());

        System.out.println("------------------------------------------------------------------");
        System.out.println("Printing stack after first pop");
        stack.printStack();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Stack is empty?\t" + stack.isEmpty());

        System.out.println("------------------------------------------------------------------");
        System.out.println("Size of the stack:\t" + stack.size());

        stack.push(employee5);
        stack.push(employee6);
        stack.push(employee7);
        stack.push(employee8);
        stack.push(employee9);
        stack.push(employee10);
        stack.push(employee11);
        stack.push(employee12);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Printing stack after pushing all employees");
        stack.printStack();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Size of the stack:\t" + stack.size());

        System.out.println("------------------------------------------------------------------");
        System.out.println("Popping all elements in the stack");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Stack is empty:\t" + stack.isEmpty());

    }

}
