package ex3;



public class MainTest_Ex3 {
    public static void main(String[] args) {
        // Create and populate the circularly linked list
        CircularlyLinkedList list = new CircularlyLinkedList();
        list.insertLast(12);
        list.insertLast(22);
        list.insertLast(33);
        list.insertLast(44);
        list.insertLast(55);

        // Clone the list
        CircularlyLinkedList clonedList = list.clone();

        // Display the cloned list
        clonedList.displayList();
    }
}