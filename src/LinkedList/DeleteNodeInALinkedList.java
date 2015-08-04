package LinkedList;

/**
 * Problem Number 237
 * 
 * Write a function to delete a node(except the tail) in the singly linked list, given
 * only access to that node.
 * 
 * Supposed the linked list is 1->2->3->4 and you are given the third node with value 3,
 * the linked list should become 1->2->4 after calling your function
 * @author mehmet
 *
 */

public class DeleteNodeInALinkedList {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;}
	}
	
	/**
	 * The solution to this is to simply copy the data from the next node into this
	 * node and then delete the next node.
	 * @param node
	 */
	public void deleteNode(ListNode node){
		if(node == null || node.next ==null){
			throw new RuntimeException();
		}
		
		//Coppy the next nodes data to removed node
		node.val = node.next.val;
		
		//We are gonna remove the next node of removed node
		//because they are similar. But we need to deference
		// its next node. Thats why we are putting remaining
		//to temp variable
		ListNode tempNode = node.next.next;
		
		//Dereferncing duplicated node for the garbage collector
		node.next.next = null;
		
		//Referencing remaining of the list
		node.next = tempNode;
	}

}
