package Math;
/**
 * Problem number 7
 * 
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * @author mehmet
 *
 */

public class ReverseInteger {
	public int reverse(int x){
		long result = 0;
		while(x != 0){
			int lastDigit = x % 10;
			x /= 10;
			result = result * 10 + lastDigit;
		}
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		
		return (int)result;
	}
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int x = 123;
		int x1 = -123;
		System.out.println("maximum long value " + Long.MAX_VALUE);
		System.out.println("minimum long value " + Long.MIN_VALUE);
		System.out.println("maximum int value " + Integer.MAX_VALUE);
		System.out.println("minimum int value " + Integer.MIN_VALUE);
		System.out.println("reverse of " + x + " = " + ri.reverse(x));
	}
	
	
}
