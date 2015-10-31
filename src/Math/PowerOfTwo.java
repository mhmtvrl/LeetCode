package Math;

/**
 * Problem Number 231
 * 
 * Given an integer, write a function to determine if it is a power of two
 * @author mehmet
 *
 */

public class PowerOfTwo {
	/**
	 * My Solution
	 * Divide number until arrive 1
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
		if(n == 1)
			return true;
		if(n == 0)
			return false;
		while(n != 1){
			if(n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
	
	/**
	 * using bits
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo1(int n) {
        return n>0&& ((n&(n-1))==0);
    }
	
	
	public static void main(String[] args) {
		PowerOfTwo pot = new PowerOfTwo();
		for(int i = 0; i <= 128; i++){
			if(pot.isPowerOfTwo1(i))
				System.out.println(i + " is power of 2");
			else
				System.out.println(i + " is not power of 2");
		}
	}

}
