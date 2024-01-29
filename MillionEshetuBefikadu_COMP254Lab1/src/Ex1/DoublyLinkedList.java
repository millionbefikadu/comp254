package Ex1;

public class DoublyLinkedList<T> {
    // Doubly linked list implementation
    
    // Node class
    private static class Node<T> {
        private T element;
        private Node<T> prev;
        private Node<T> next;
        
        public Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
    
    private Node<T> header;
    private Node<T> trailer;
    private int size;
    
    // Constructor
    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
        size = 0;
    }
    
    // Concatenates two doubly linked lists
    public static <T> DoublyLinkedList<T> concatenate(DoublyLinkedList<T> L, DoublyLinkedList<T> M) {
        DoublyLinkedList<T> concatenatedList = new DoublyLinkedList<>();
        
        Node<T> lastNodeL = L.trailer.prev;
        Node<T> firstNodeM = M.header.next;
        
        // Connect the end of L into the beginning of M
        lastNodeL.next = firstNodeM;
        firstNodeM.prev = lastNodeL;
        
        // Update the size of the concatenated list
        concatenatedList.size = L.size + M.size;
        
        // Set the header and trailer nodes of the concatenated list
        concatenatedList.header = L.header;
        concatenatedList.trailer = M.trailer;
        
        return concatenatedList;
    }
    
    // Adds a new node with the given element to the end of the list
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element, trailer.prev, trailer);
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }
    
    // Returns a string representation of the list
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = header.next;
        while (current != trailer) {
            sb.append(current.element).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
    
