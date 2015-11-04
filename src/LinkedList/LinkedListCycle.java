package LinkedList;

/**
 * Problem #141
 * 
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up:
 * 
 * Can you solve it without using extra space?
 * 
 * @author mehmet
 *
 */

public class LinkedListCycle {
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	/**
	 * Two pointer can be used. Slow pointer and fast pointer. 
	 * Slow pointer moves 1 steps and fast pointer moves 2 steps.
	 * If they intersects the list has cycle
	 * @param head
	 * @return
	 */
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != null && fast != null && slow.next != null && fast.next != null){
            if(slow.val == fast.val)
                return true;
            
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
        
    }	

}
