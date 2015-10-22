package Arrays;

public class MaximumSubarray {
	
//	 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//	 For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
//	 the contiguous subarray [4,−1,2,1] has the largest sum = 6. 
	
	public int maxSubArray(int[] nums) {
        int newSum = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(newSum + nums[i] > nums[i])
                newSum = newSum + nums[i];
            else
                newSum = nums[i];
            
            if(newSum > max)
                max = newSum;
        }
        
        return max;
    }

}
