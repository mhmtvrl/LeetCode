package LinkedList;

public class RemoveDuplicatesFromSortedLinkedList {
	
	//Given a sorted linked list, delete all duplicates such that each element appear only once. 
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while(current != null){
            if(current.next != null && current.val == current.next.val)
                current.next = current.next.next;
            else 
                current = current.next;
            
        }
        
        return head;
    }

}
