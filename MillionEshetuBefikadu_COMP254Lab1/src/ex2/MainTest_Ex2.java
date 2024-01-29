

package ex2;

   public class MainTest_Ex2 {
	   public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        // Get references to node1 and node2
	        SinglyLinkedList.Node node1 = list.getHead().next; // Assuming node1 is the second node in the list
	        SinglyLinkedList.Node node2 = list.getHead().next.next; // Assuming node2 is the third node in the list

	        System.out.println("Before swapping:");
	        list.displayList();

	        // Swap node1 and node2
	        list.swapNodes(node1, node2);

	        System.out.println("After swapping:");
	        list.displayList();
	    }
	}