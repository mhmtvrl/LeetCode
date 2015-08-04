package LinkedList;

/**
 * Problem Number : 2
 * 
 * You are given two linked lists representing two non-negative numbers. The digits are stored in
 * the reverse order and each of their nodes contain a single digit. Add the two numbers and return
 * it as a linked list.
 * 
 * Input  : (2->4->3) + (5->6->4)
 * Output : 7->0->8
 * 
 * case 1 : [5] + [5] = [0, 1]
 * case 2 : [1, 8] + [0] = [1, 8]
 * case 3 : [9, 8] + [1] = [0, 9]
 * @author mehmet
 *
 */
public class AddTwoNumbers {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * 3 tane pointer var 2 si gelen listeleri dolaniyor 3.sude yeni listeyi
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            throw new RuntimeException("lists are empty");
        }
        
        //initialize result linked list
        int remainder = 0;
        int sum = l1.val + l2.val + remainder;
        
        if(sum > 9){
            sum = sum % 10;
            remainder = 1;
        }
        
        ListNode sumHead = new ListNode(sum);
        ////////////////////////////////
        
        ListNode currentSum = sumHead;
        //since in order to initialize result list we used first elements of the lists,
        //current pointer starts their nexts
        ListNode current1 = l1.next;
        ListNode current2 = l2.next;
        
        //the lists don't need to be same length thats why it is or
        while(current1 != null || current2 != null) {
        	
        	
            if(current1 == null)
                sum = 0 + current2.val + remainder;
            else if(current2 == null)
                sum = current1.val + 0 + remainder;
            else
                sum = current1.val + current2.val + remainder;
            remainder = 0; //after adding remainder we need to make it zero if we don't
            				// it is gonna be used again after finishing the loop
            if(sum > 9){
                sum = sum % 10;
                remainder = 1;
            }
            
            if(current1 != null)
                current1 = current1.next;
            if(current2 != null)
                current2 = current2.next;
            //we added new node with sum of two node at the end of the list
            currentSum.next = new ListNode(sum);
            //move the pointer at the end of the list
            currentSum = currentSum.next;
        }
        
        //if there is remainder after at the end of the loop
        //10 + 90 = 100
        if(remainder > 0){
            currentSum.next = new ListNode(remainder);
            currentSum = currentSum.next;
        }
        
        return sumHead;
    }
}
