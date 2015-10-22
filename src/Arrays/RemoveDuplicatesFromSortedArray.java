package Arrays;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;
            
        int arrayIterator = 1;
        int sameElementCurser = 0;
        
        while(arrayIterator < nums.length){
            if(nums[arrayIterator] == nums[sameElementCurser])
                arrayIterator++;
            else{
                sameElementCurser++;
                nums[sameElementCurser] = nums[arrayIterator];
                arrayIterator++;
            }
        }
        return sameElementCurser + 1;
    }
}
