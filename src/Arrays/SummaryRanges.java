package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem #228
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * @author mehmet
 *
 */

public class SummaryRanges {
	
	public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length == 0)
        	return list;
		String range;
        int first = nums[0];
        int last = nums[0];
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] == nums[i - 1] + 1){
        		last = nums[i];
        	}
        	else {

        		if(first != last)
        			range = first + "->" + last;
        		else
        			range = first + "";
        		list.add(range);
        		first = nums[i];
        		last = nums[i];
        	}
        }
        if(first != last)
			range = first + "->" + last;
		else
			range = first + "";
		list.add(range);
        return list;
    }
	
	public static void main(String[] args) {
		SummaryRanges sr = new SummaryRanges();
		int[] nums = {1};
		
		System.out.println(sr.summaryRanges(nums).toString());
	}

}
