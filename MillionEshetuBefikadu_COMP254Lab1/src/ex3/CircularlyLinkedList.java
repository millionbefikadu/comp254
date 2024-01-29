package ex3;

public class CircularlyLinkedList {
    private Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public CircularlyLinkedList clone() {
        CircularlyLinkedList clonedList = new CircularlyLinkedList();

        if (head == null) {
            // Original list is empty
            return clonedList;
        }

        Node currentNode = head;

        // Clone the nodes and link them in the cloned list
        do {
            clonedList.insertLast(currentNode.data);
            currentNode = currentNode.next;
        } while (currentNode != head);

        return clonedList;
    }
}