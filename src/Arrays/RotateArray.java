package Arrays;

import java.util.Arrays;

/**
 * Problem number 189
 * 
 * Rotate Array
 * 
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * Note:
 * 
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve
 * this problem
 * @author mehmet
 *
 */
public class RotateArray {
	public void rotateByOne(int[] nums){
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		
		for(int i = nums.length - 2; i > 0; i--){
			nums[i + 1] = nums[i];
		}
		nums[1] = temp;
	}
	/**
	 * This solution exceeded time so this is not valid solution
	 * @param nums
	 * @param k
	 */
	public void rotate1(int[] nums, int k) {
		if(nums.length < 2)
			return;
        for(int i = 0; i < k % nums.length; i++)
        	this.rotateByOne(nums);
    }
	
	/**
	 * 1. Divide array two part. First part is length of arr.length - k and second part will be k
	 * 2. Reverse first part
	 * 3. Reverse second part
	 * 4. Reverse whole array
	 * @param nums
	 * @param k
	 */
	public void rotate2(int[] nums, int k){
		if(nums.length < 2)
			return;
		
		k = k % nums.length;
		
		int lengthOfFirstPart = nums.length - k;
		reverse(nums, 0, lengthOfFirstPart - 1);
		reverse(nums, lengthOfFirstPart, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}
	/**
	 * 
	 * @param nums
	 * @param begin is first index
	 * @param end is last index
	 */
	public void reverse(int[] nums, int begin, int end){
		if(nums.length == 1)
			return;
		while(begin < end){
			int temp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = temp;
			begin++; end--;
		}
	}
	
	/**
	 * A Juggling Algorithm
	 * http://www.geeksforgeeks.org/array-rotation/
	 * 
	 * implement this one
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate3(int[] nums, int k){
		
	}
	
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		int [] nums = {1,2,3,4,5,6,7};
		ra.rotate2(nums, 3);
		System.out.println(Arrays.toString(nums));
	}

}
