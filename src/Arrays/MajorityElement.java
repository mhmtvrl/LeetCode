package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Problem Number 169
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Three solution is provided. 1st is my solution, 2nd is from another source, 3rd is scientific approach.
 * 
 * My favourite solution is 2nd solution.
 * 
 * @author mehmet
 *
 */

public class MajorityElement {

	/**
	 * O(n) time
	 * O(n) space
	 * Stores frequency in HashMap
	 * @param nums
	 * @return
	 */
	public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(table.containsKey(nums[i])) {
        		int currentValue = table.get(nums[i]);
        		currentValue++;
        		table.put(nums[i], currentValue);
        	} else {
        		table.put(nums[i], 1);
        	}
        }
        
        Iterator<Integer> iter = table.keySet().iterator();
        int max = 0;
        int maxElement = 0;
        while(iter.hasNext()) {
            Integer current = iter.next();
            if(table.get(current) > max){
                max = table.get(current);
                maxElement = current;
            }
        }
        return maxElement;
    }
	
	/**
	 * http://www.programcreek.com/2014/02/leetcode-majority-element-java/
	 * O(nlogn) time complexity because we are sorting the array
	 * O(1) space complexity
	 * 
	 * majority element always passes to middle
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement2(int[] nums){
		if(nums.length == 1)
			return nums[0];
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
	
	/**
	 * http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
	 * Majority Vote Algorithm for this problem
	 * O(n) time
	 * O(1) space
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement3(int[] nums){
		int result = 0, count = 0;
		 
	    for(int i = 0; i<nums.length; i++ ) {
	        if(count == 0){
	            result = nums[ i ];
	            count = 1;
	        }else if(result == nums[i]){
	           count++;
	        }else{
	           count--;
	        }
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		MajorityElement element = new MajorityElement();
		int[] nums = {-1,1,1,1,2,1};
		
		System.out.println("majority element is " + element.majorityElement1(nums));
	}
	
}
