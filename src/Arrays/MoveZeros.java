package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class MoveZeros {
	
	public void moveZeroes1(int[] nums) {
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != 0 ){
        		int j = i;
        		while(j != 0 && nums[j - 1] == 0){
        			int temp = nums[j];
        			nums[j] = nums[j - 1];
        			nums[j - 1] = temp;
        			j--;
        		}
        	}      		
        }
    }
	
	public void moveZeroes(int[] nums){
		int count = 0; //points the current position on array
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				nums[count++] = nums[i];
			}
		}
		
		for(int i = count; i < nums.length; i++){
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		MoveZeros mz = new MoveZeros();
		int nums[] = {0, 1, 0, 3, 12};
		int nums1[] = {};
		int nums2[] = {1};
		int nums3[] = {0};
		int nums4[] = {0, 0, 0, 0, 0};
		int nums5[] = {1, 2, 3, 4};
		int nums6[] = {0, 0, 0, 1, 2, 3};
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		mz.moveZeroes(nums);
		System.out.println("nums : " + Arrays.toString(nums));
		mz.moveZeroes(nums1);
		System.out.println("nums1 : " + Arrays.toString(nums1));
		mz.moveZeroes(nums2);
		System.out.println("nums2 : " + Arrays.toString(nums2));
		mz.moveZeroes(nums3);
		System.out.println("nums3 : " + Arrays.toString(nums3));
		mz.moveZeroes(nums4);
		System.out.println("nums4 : " + Arrays.toString(nums4));
		mz.moveZeroes(nums5);
		System.out.println("nums5 : " + Arrays.toString(nums5));
		mz.moveZeroes(nums6);
		System.out.println("nums6 : " + Arrays.toString(nums6));
		mz.moveZeroes(arr);
		System.out.println("arr : " + Arrays.toString(arr));
		Stack<Integer> stack = new Stack<Integer>();
	}

}
