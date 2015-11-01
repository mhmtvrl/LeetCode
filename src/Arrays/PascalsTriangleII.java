package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem #119 Pascal's Triangle II
 * 
 * Given an index k, return the kth row of the Pascal's Triange.
 * 
 * For example, given k=3,
 * 
 * Return [1,3,3,1]
 * 
 * Note:
 * 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 * @author mehmet
 *
 */

public class PascalsTriangleII {
	
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        
        return row;
    }
    
    public static void main(String[] args) {
		PascalsTriangleII p = new PascalsTriangleII();
		for(int i = 0; i < 100; i++){
			System.out.println(p.getRow(i));
		}
	}
}
