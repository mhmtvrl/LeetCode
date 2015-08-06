package LinkedList;
/**
 * Problem number 	: 203
 * Problem url		: https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * Remove all elements from linkedlistof integers that have value val.
 * 
 * Example
 * 
 * Given: 1->2->6->3->4->5->6, val = 6
 * 
 * Return: 1->2->3->4->5
 * @author mehmet
 *
 */

public class RemoveLinkedListElements {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x; }
	}
	
	/**
	 * Deletion :
	 * 	1.)store current note to temp
	 * 	2.)move current to next node
	 *  3.)point prev.next to current
	 *  4.)point temp.next to null
	 *  
	 * Temp node is deleted node. If we don't dereference deleted note garbage
	 * collector doesn't collect it and it become memory leak.
	 * 
	 * TODO Refactor
	 * TODO Performance is average
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        ListNode current = head;
        ListNode previous = null;
        
        while(current != null){
            if(current.val == val) {
                ListNode temp = current;
                current = current.next;
                
                //When we delete first node it references null so it doesn't have next
                if(previous != null)
                	//condition for non-first node
                    previous.next = current;
                else
                	//Head shows first node so when we delete first node
                	//we should change the head
                    head = current;
                temp.next = null;
            }
            //We moved pointers when we deleted the node so we don't need to move them again
            //but if we don't delete any node in the iteration we should move pointers.
            else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

}
