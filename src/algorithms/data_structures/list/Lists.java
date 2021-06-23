package algorithms.data_structures.list;

import algorithms.data_structures.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sandra", "Binoy", 001));
        employeeList.add(new Employee("Wynter", "Binoy", 002));
        employeeList.add(new Employee("Sommer", "Binoy", 003));
        employeeList.add(new Employee("Astrid", "Binoy", 004));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(3, new Employee("Astrid", "S", 005));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Astrid", "Binoy", 4));
        employeeList.remove(4);

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.contains(new Employee("Astrid", "Binoy", 4)));
        System.out.println(employeeList.indexOf(new Employee("Astrid", "Binoy", 4)));


    }

}
