package linked_list.lab;

public class LinkedList<T> {
    private class Node {
        T value;
        Node next;

        Node(T val) {
            value = val;
            next = null;
        }

    }

    private Node firstNode = null;
    private Node lastNode = null;
    int count = 0;

    // achieved O(1) time complexity! :)
    public void add(T s) {
        Node newNode = new Node(s);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        count++;
    }
}
