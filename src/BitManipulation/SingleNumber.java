package BitManipulation;

/**
 * Problem # 136
 * 
 * Single Number
 * 
 * Given an array of integers, every element appears twice for one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memo?
 * @author mehmet
 *
 */
public class SingleNumber {
	
	/**
	 * XOR is solution for this problem. XOR generates 0
	 * if operands are same otherwise it generates 1.
	 * For example A xor A = 0
	 * B xor 0 = B
	 * 
	 * A xor A xor B xor B xor C = C
	 * 
	 * Since XOR is commutative and associative, we don't need to
	 * consider the order in the array.
	 * 
	 * http://blog.allenzhao.com/leetcode/2014/09/13/leetcode-single-number/
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums){
		int x = 0;
		for(int a : nums){
			x = x ^ a;
		}
		return x;
	}
}
