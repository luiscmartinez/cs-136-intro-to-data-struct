package queues.homework;

public class GenericQueueDemo {
    public static void main(String[] args) {
        GenericQueue<Employee> queue = new GenericQueue<Employee>();
        Employee[] employees = {
                new Employee("Alfonso", 15),
                new Employee("Bob", 17),
                new Employee("Carol", 21),
                new Employee("Deborah", 18),
                new Employee("Elaine", 22)
        };
        System.out.println("Adding employees: ");
        for (Employee e : employees) {
            System.out.print(e + " ");
            queue.enqueue(e);
        }
        System.out.println("\nState of queue is: ");
        System.out.println(queue);
        System.out.println("Removing 2 employees.");
        queue.dequeue();
        queue.dequeue();
        System.out.println("State of queue is: ");
        System.out.println(queue);
        System.out.println("Adding the employee Elaine:");
        queue.enqueue(new Employee("Elaine", 90000));
        System.out.println("State of queue is: ");
        System.out.println(queue);
    }
}
