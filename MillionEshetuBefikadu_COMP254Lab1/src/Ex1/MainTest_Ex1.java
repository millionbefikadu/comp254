package Ex1;

public class MainTest_Ex1 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> L = new DoublyLinkedList<>();
        L.addLast(1);
        L.addLast(2);
        
        DoublyLinkedList<Integer> M = new DoublyLinkedList<>();
        M.addLast(3);
        M.addLast(4);
        
        DoublyLinkedList<Integer> concatenatedList = DoublyLinkedList.concatenate(L, M);
        
        System.out.println("Concatenated list: " + concatenatedList.toString());
    }
}
