package linked_list.lab;

public class LinkedListDemo {
    public static void main(String[] arg) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Amy");
        myList.add("Bob");
        myList.add("Chuck");
        myList.add("Daisy");
        System.out.println(myList);

        myList.add("Eve", 1);
        System.out.println(myList);
    }
}
