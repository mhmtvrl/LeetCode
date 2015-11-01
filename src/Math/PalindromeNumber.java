package Math;

/**
 * Problem number 9
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author mehmet
 *
 */
public class PalindromeNumber {
	
	/**
	 * There can be three solutions.
	 * 1.)Convert integer to string and then check that whether it is palindrome or not.
	 * This solution requires extra space because of string conversion so we cannot use this.
	 * 
	 * 2.)Reverse integer and compare itself. This might work but there is a trick part.
	 * Reversed integer can be overflow. 
	 * 
	 * 3.)Compare first and last digit. If they are not same it is not palindrome. If they are
	 * same chop them. Continue comparison. I will use this solution
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x){
		if(x < 0)
			return false;
		int numberOfDigit = 0;
		int tempNumber = x;
		while(tempNumber != 0){
			numberOfDigit++;
			tempNumber /= 10;
		}
		while(numberOfDigit > 1){
			int firstDigit = x / (int)Math.pow(10, numberOfDigit - 1);
			int lastDigit = x % 10;
			if(firstDigit != lastDigit)
				return false;
			x /= 10;
			x = x - ((int)Math.pow(10, numberOfDigit - 2) * firstDigit);
			numberOfDigit -= 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		PalindromeNumber pal = new PalindromeNumber();
		int x = 9999;
		int x1 = -1233212;
		if(pal.isPalindrome(x))
			System.out.println(x + " is palindrome");
		else
			System.out.println(x + " is not palindrome");
		System.out.println(22321 / 10000);
	}

}
