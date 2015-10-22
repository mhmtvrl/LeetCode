package Arrays;

import java.util.Arrays;

//Given an unsorted array of integers, find the length of the longest consecutive elements sequence. 

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
		int max = 1;
		int count = 1;
		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i + 1] == nums[i] + 1){
				count++;
			}
			else if(nums[i] == nums[i + 1])
			{
				;
			}
			else{
				count = 1;	//?
			}
				
			if(count > max){
				max = count;
			}
		}
		return max;
    }
}
