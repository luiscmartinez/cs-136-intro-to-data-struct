package generics.homework_1;

// Luis Martinez
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Employee[] employees = createEmployeeArray(3);
        // HighestLowest highestLowestEmployees = new HighestLowest(employees);
        Employee[] employees = new Employee[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Collecting Employee " + (i + 1) + " Information");
            System.out.println("Enter Employee " + (i + 1) + " name:");
            String name = input.nextLine();
            System.out.println("Please enter Employee " + (i + 1) + " Age:");
            int age = input.nextInt();
            input.nextLine();
            employees[i] = new Employee(name, age);
        }
        HighestLowest<Employee> highestLowestEmployees = new HighestLowest<Employee>(employees);
        System.out.println("The oldest employee is: " + highestLowestEmployees.getHighest().getName());
        System.out.println("The youngest employee is: " + highestLowestEmployees.getLowest().getName());
    }

    static Employee[] createEmployeeArray(int arraySize) {
        Employee[] employees = new Employee[arraySize];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Collecting Employee " + (i + 1) + " Information");

            System.out.println("Enter Employee " + (i + 1) + " name:");

            String name = input.nextLine();

            System.out.println("Please enter Employee " + (i + 1) + " age:");
            int age = input.nextInt();
            input.nextLine();

            employees[i] = new Employee(name, age);
        }
        return employees;
    }
}

interface Comparable<T> {
    int compareTo(T o);
}

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }
}

class City implements Comparable<City> {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(City o) {
        if (this.population > o.population) {
            return 1;
        } else if (this.population < o.population) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }
}

// extends also means "implements"
class HighestLowest<T extends Comparable<T>> {
    private T highest;
    private T lowest;

    public HighestLowest(T[] arr) {
        highest = arr[0];
        lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(highest) > 0) {
                highest = arr[i];
            }
            if (arr[i].compareTo(lowest) < 0) {
                lowest = arr[i];
            }
        }
    }

    T getHighest() {
        return highest;
    }

    T getLowest() {
        return lowest;
    }
}
