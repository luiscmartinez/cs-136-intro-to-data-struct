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

    public void add(T s, int pos) {
        Node newNode = new Node(s);
        if (firstNode.next == null && pos == 1) {
            newNode.next = firstNode;
            firstNode = newNode;
        } else {
            Node ref = firstNode;
            int hops = 1;
            Node prevNode = ref;
            if (firstNode.next != null && pos == 1) {
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                while (ref.next != null && hops < pos) {
                    prevNode = ref;
                    ref = ref.next;
                    hops++;
                }
                prevNode.next = newNode;
                newNode.next = ref;
            }
        }
        count++;
    }
}
