package HashTable;

import java.util.HashMap;



public class TwoSum {
	
	/**
	 * Failed cases:
	 * [0, 4, 3, 0] 0
	 * [-1, -2, -3, -4, -5] -8
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
        //Tum sayilari hash map e al. Key sayi value de indexi
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            int numberInTheArray = nums[i];
            int otherNumber = target - numberInTheArray;
            //map.get(otherNumber) != i kontrolu [0, 4, 3, 0] 0 icin konuldu
            if(map.containsKey(otherNumber) && map.get(otherNumber) != i){
                arr[0] = Math.min(i, map.get(otherNumber)) + 1;
                arr[1] = Math.max(i, map.get(otherNumber)) + 1;
                return arr;
            }
        }
        return arr;
    }
}
