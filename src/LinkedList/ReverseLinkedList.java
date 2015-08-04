package LinkedList;

/**
 * Problem Number : 206
 * 
 * Reverse a singly linked list
 * 
 * Hint :
 * 
 * A linked list can be reversed either iteratively or recursivelly.
 * Could you implement both?
 * 
 * 
 * @author mehmet
 *
 */

public class ReverseLinkedList {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	//add element head of the linked list
	public ListNode addFirst(ListNode head, ListNode key){
        if(head == null){
            head = new ListNode(key.val);
            return head;
        }
        
        ListNode temp = head;
        head = new ListNode(key.val);
        head.next = temp;
        return head;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode reversedHead = null;
        ListNode current = head;
        while(current != null) {
            reversedHead = addFirst(reversedHead, current);
            current = current.next;
        }
        return reversedHead;
    }

}
