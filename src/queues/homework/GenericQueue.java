package queues.homework;

class GenericQueue<T> {

    private class Node<T> {
        T value;
        Node<T> next;
    }

    public int length = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public void enqueue(T data) {
        if (head == null) {
            head = new Node<T>();
            head.value = data;
            tail = head;
        } else {
            Node<T> newNode = new Node<T>();
            newNode.value = data;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (length == 0) {
            System.out.println("Queue is empty");
            return null;
        } else {
            T value = head.value;
            head = head.next;
            length--;
            return value;
        }
    }

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();

        Node<T> current = head;
        while (current != null) {
            sBuilder.append(current.value);
            current = current.next;
        }
        return sBuilder.toString();
    }
}