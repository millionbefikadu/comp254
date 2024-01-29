package ex2;

public class SinglyLinkedList {
    private Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node getHead() {
        return head;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void swapNodes(Node node1, Node node2) {
        if (node1 == node2) {
            // Nodes are the same, no need to swap
            return;
        }

        Node prevNode1 = null;
        Node prevNode2 = null;
        Node currentNode = head;

        // Traverse the list to find the previous nodes of node1 and node2
        while (currentNode != null && (prevNode1 == null || prevNode2 == null)) {
            if (currentNode.next == node1) {
                prevNode1 = currentNode;
            }

            if (currentNode.next == node2) {
                prevNode2 = currentNode;
            }

            currentNode = currentNode.next;
        }

        // Check if node1 and node2 were found in the list
        if (prevNode1 == null || prevNode2 == null) {
            // One or both nodes not found in the list
            return;
        }

        // Swap the nodes
        if (prevNode1 != null) {
            prevNode1.next = node2;
        } else {
            head = node2;
        }

        if (prevNode2 != null) {
            prevNode2.next = node1;
        } else {
            head = node1;
        }

        Node temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;
    }
}