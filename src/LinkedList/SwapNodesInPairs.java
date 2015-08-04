package LinkedList;

/**
 * Problem number : 24
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example,
 * 
 * Give 1->2->3->4, you should return the list as 2->1->4->3
 * 
 * Tour algorithm should use only constant space. You may not modify
 * values in the list, only nodes itself can be changed.
 * 
 * @author mehmet
 *
 */
public class SwapNodesInPairs {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x; }
	}
	
	/**
	 * Algoritma soyle calisiyor 3 tane pointer var
	 * current 1: head den basliyor swap yapilacak elemanlardan basta olani
	 * 			  gosteriyor.
	 * current 2: head.next ten basliyor swap yapilacak elemanlardan 2. olani
	 * 			  gosteriyor.
	 * previous : null degeri ile basliyor current 1 den onceki elemani gosteriyor.
	 * 
	 * Algoritma 3 asamadan olusuyor.
	 * 
	 * 1.)Swap islemi
	 * 2.)Pointerlari eski yerine yerlestirme.
	 * 3.)Poinerlari ilerletme
	 * 
	 * 1.)Swap islemi:
	 * 		i.)current1 in nexti current 2 nin nextini gosterecek
	 * 		ii.)current 2 nin nexti current 1 i gosterice
	 * 		iii.)previous'un nexi current 2 yi gosterice
	 * 2.)Pointerlari eski yerine yerlestirme:
	 * 		current 1 pointer i artik current 2 nin gosterdigini curren 1 in pointer i da current2 nin
	 * 		nexitni gostericek
	 * 		Bunu yapmazsak 1->2->3->4 te sonsuz donguye girip patliyor
	 * 3.)Pointerlari ilerletme:
	 * 		pointerlar 2 eleman ilerleyecek
	 * 
	 *  *baslangicta dikkat edilmesi gereken kisim head pointeri head.nexti gostermeli cunku headle 
	 * yanindaki yer degistirince artik head 1. elemani degil 2. elemani gostermeye basliyor
	 * @param head
	 * @return
	 */
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        //Pointerlar
        ListNode current1 = head;
        ListNode current2 = head.next;
        ListNode previous = null;
        
        //sebebi * 
        head = head.next;
        
        while(current1 != null && current2 != null) {
        	//Swap islemi
            current1.next = current2.next;
            current2.next = current1;
            if(previous != null)
                previous.next = current2;
            
            //Pointerlari eski yerine koyma
            current1 = current2;
            current2 = current2.next;
            previous = current2;
            
            
            //Pointerlari ilerletme
            if(current1.next != null)
                current1 = current1.next.next;
            if(current2.next != null)
                current2 = current2.next.next;
        }
        
        return head;
    }

}
