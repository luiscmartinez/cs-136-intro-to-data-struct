package queues.homework;

import java.util.Scanner;

public class GenericQueueDemo {
    public static void main(String[] args) {
        GenericQueue<Employee> queue = new GenericQueue<Employee>();
        Employee[] employees = {
                new Employee("Alfonso", 15),
                new Employee("Bob", 17),
                new Employee("Carol", 21),
                new Employee("Deborah", 18),
                new Employee("Elaine", 19)
        };
        for (Employee e : employees) {
            queue.enqueue(e);
        }
        System.out.println("\nState of Queue: ");
        System.out.println(queue);
        // building menu
        StringBuilder menu = new StringBuilder();
        menu.append("QUEUE MENU\n");
        menu.append("1: Add Entry (enqueue)\n");
        menu.append("2: Remove Entry (dequeue)\n");
        menu.append("3: QUIT\n");
        menu.append("Please enter your selection: ");
        menu.toString();
        System.out.println(menu);
        Scanner userInput = new Scanner(System.in);
        int selection = userInput.nextInt();
        while (selection != 3) {
            switch (selection) {
                case 1:
                    System.out.println("Enter the name of the employee: ");
                    String name = userInput.next();
                    System.out.println("Enter the salary of the employee: ");
                    int salary = userInput.nextInt();
                    queue.enqueue(new Employee(name, salary));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                default:
                    System.out.println("Please enter '1', '2', or '3'");
            }
            System.out.println("State of queue is: ");
            System.out.println(queue.toString());
            System.out.println(menu);
            selection = userInput.nextInt();
        }
        System.out.println("Thank you, goodbye!");
    }
}
