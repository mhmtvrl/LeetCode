package LinkedList;
/**
 * Problem number 	: 160
 * Problem url		: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begin.
 * 
 * For example, the following two linked lists:
 * 
 * A: a1->a2->c1->c2->c3
 * B: b1->b2->b3->c1->c2->c3
 * 
 * begin to intersect at node c1.
 * 
 * Notes:
 * 	- If the two linked lists have no intersection at all, return null.
 *  - The linked lists must retain their original structure after the function returns.
 *  - You may assume there are no cycles anywhere in the entire linked structure.
 *  - Your code should preferably run in O(n) time and use only O(1) memory.
 *  - Two linked list intersect at one point and become one list after that point.
 *  
 *  Good solutions :
 *  
 *  http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
 * @author mehmet
 *
 */
public class IntersectionOfTwoLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}		
		/**
		 * 1.)Count 1nd list
		 * 2.)Count 2nd list
		 * 3.)Store last elements of the lists
		 * 4.)If the last elements are not equal lists does not have intersection point
		 *    then return null;
		 * 5.)Find the difference between length of two linked list lets say 'n'
		 * 6.)n step move forward for the longer list. Now two lists intersected elements
		 *    are cover each other.
		 * 7.)iterate over two list and compare elements. If you find same element, it is
		 *    intersection point. Return it.
		 *    
		 *  Note: compare references, not values.
		 *  
		 *  TODO: Refactor code. Create function which calculates number of nodes.
		 *  TODO: Performance is terrible.
		 *  TODO: Implement circle and calculation methods referenced in geeksforgeeks.
		 *  
		 *  Time complexity O(m+n)
		 *  Space complexity O(1)
		 * @param headA
		 * @param headB
		 * @return
		 */
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA == null || headB == null)
	            return null;
	        
	        int nodeCountA = 0;
	        int nodeCountB = 0;
	        
	        //Stores last element of the lists. We are gonna compare
	        //these references as a shortcut.
	        ListNode lastNodeA;
	        ListNode lastNodeB;
	        
	        //List pointers.
	        ListNode currentA = headA;
	        ListNode currentB = headB;
	        
	        //Counting number of nodes. We stop last element
	        //by saying currentA.next != null because we need
	        //to store last element in order to compare.
	        //If we say current != null we stop outside the list
	        while(currentA.next != null) {
	            nodeCountA++;
	            currentA = currentA.next;
	        }
	        //this increment for the last element because
		  	//we stop at the last element and that time it
		  	//doesn't enter the loop so does not increment
			//the number of nodes. Infact it doesn't matter.
			//because afterall we are gonna take difference
			//of number of nodes of two linkedlist.
	        nodeCountA++; 
	        lastNodeA = currentA;
	        
	        //Counting number of nodes
	        while(currentB.next != null) {
	            nodeCountB++;
	            currentB = currentB.next;
	        }
	        nodeCountB++;
	        lastNodeB = currentB;
	        
	        //If the last nodes are not equal there is no intersection
	        //point so the remaining calculations become unnecessary.
	        if(lastNodeB != lastNodeA)
	            return null;
	        
	        //Reseting the list pointers.
	        currentA = headA;
	        currentB = headB;
	        
	        //difference between number of nodes of two linked list
	        int differenceBetweenLength = Math.abs(nodeCountA - nodeCountB);
	        
	        //Identifiying short and long lists
	        ListNode longList = headA;
	        ListNode shortList = headB;
	        
	        if(nodeCountA > nodeCountB){
	            longList = headA;
	            shortList = headB;
	        }
	        else {
	            longList = headB;
	            shortList = headA;
	        }
	            
	        //Bring list pointer differenceBetweenLength steps forward in order to make
	        //cover intersection interval.
	        for(int i = 0; i < differenceBetweenLength; i++)
	            longList = longList.next;
	        
	        //Finding intersection point. It doesn't matter iterating with shortList or longList
	        //because now they have same number of elements.
	        while(shortList != null){
	            if(shortList == longList)
	                return shortList;
	            shortList = shortList.next;
	            longList = longList.next;
	        }
	        
	        return null;
	    }
	}
}
