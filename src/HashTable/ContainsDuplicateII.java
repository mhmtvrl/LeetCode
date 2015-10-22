package HashTable;

import java.util.HashMap;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Hashmap yarat
        //sayi key indexide value
        //eger cantains se indexlerin farkini al kyla karsilastir return true
        //dongu biterse return false
        
        //Update oldugunda kaybetme olayi var onu bir arastir [1, 0, 1, 1], 1 true donmesi lazim fakat
        //absli iften sonra put demezsen false donuyor yanlis. Buna bi bak
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(i - map.get(nums[i])) <= k){
                    return true;
                }
                else {
                    map.put(nums[i], i);    
                }
            }
            else {
                map.put(nums[i], i);
            }
        }
        
        return false;
        
    }
}
