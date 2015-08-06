package LinkedList;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Follow up:
 * 
 * Could you do it in O(n) time and O(1) space
 * 
 * TODO follow up
 * @author mehmet
 *
 */
public class PalindromeLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	/**
	 * Push all elements to stack
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
            
        Stack<Integer> stack = new Stack<Integer>();
        ListNode current = head;
        
        while(current != null) {
            stack.push(current.val);
            current = current.next;
        }
        
        current = head;
        
        while(current != null){
            if(stack.peek() == current.val)
                stack.pop();
            current = current.next;
        }
        
        if(stack.empty())
            return true;
        return false;
    }
}
