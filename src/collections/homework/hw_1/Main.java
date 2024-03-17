package collections.homework.hw_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class EmployeeMap {
    private Map<Integer, Employee> employeeMap;

    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();
        Employee employee_1 = new Employee("Eason", 1);
        Employee employee_2 = new Employee("Lisa", 2);
        Employee employee_3 = new Employee("Anna", 3);
        Employee employee_4 = new Employee("Oliva", 4);
        Employee employee_5 = new Employee("Madelyn", 5);
        Employee employee_6 = new Employee("Sam", 6);

        employeeMap.addEmployee(employee_1);
        employeeMap.addEmployee(employee_2);
        employeeMap.addEmployee(employee_3);
        employeeMap.addEmployee(employee_4);
        employeeMap.addEmployee(employee_5);
        employeeMap.addEmployee(employee_6);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter the employee ID or Negative number to exit: ");

            String userResponse = scanner.nextLine();
            if (userResponse.startsWith("-")) {
                break;
            }
            int id = Integer.parseInt(userResponse);
            Employee employee = employeeMap.getEmployee(id);
            if (employee != null) {
                System.out.println("This employee is: " + employee.getName());
            } else {
                System.out.println("This employee does not exist!");
            }
        }
    }
}
