package String;

/**
 * Problem number 8
 * 
 * String to Integer (atoi)
 * 
 * Implement atoi to convert string to an integer
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, please
 * do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 * 
 * 
 * @author mehmet
 *
 */

public class StringToInteger {
	
	
	/**
	 * Refactor switch case it is very ugly.
	 * @param str
	 * @return
	 */
	public int myAtoi(String str){
		str = str.trim();
		if(str.length() == 0)
			return 0;
		long number = 0;
		int counter = 0;
		int untilSign = 0;
		if(str.charAt(0) == '-' || str.charAt(0) == '+'){
			untilSign = 1;
		}
			
		
		for(int i = str.length() - 1; i >= untilSign ; i--){
			Character num = str.charAt(i);
			switch (num) {
			case '0':
				number += 0 * Math.pow(10, counter);
				counter++;
				break;
			case '1':
				number += 1 * Math.pow(10, counter);
				counter++;
				break;
			case '2':
				number += 2 * Math.pow(10, counter);
				counter++;
				break;
			case '3':
				number += 3 * Math.pow(10, counter);
				counter++;
				break;
			case '4':
				number += 4 * Math.pow(10, counter);
				counter++;
				break;
			case '5':
				number += 5 * Math.pow(10, counter);
				counter++;
				break;
			case '6':
				number += 6 * Math.pow(10, counter);
				counter++;
				break;
			case '7':
				number += 7 * Math.pow(10, counter);
				counter++;
				break;
			case '8':
				number += 8 * Math.pow(10, counter);
				counter++;
				break;
			case '9':
				number += 9 * Math.pow(10, counter);
				counter++;
				break;
			default:
				number = 0;
				counter = 0;
			}
		}
		
		
		if(str.charAt(0) == '-'){
			number = -1 * number;
		}
		
		if(number > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(number < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		
		return (int)number;
	}
	
	public static void main(String[] args) {
		StringToInteger sti = new StringToInteger();
		String str = "123";
		String str1 = "-123";
		String str2 = "+123";
		String str3 = "0";
		String str4 = "";
		String str5 = "    010";
		String str6 = "  -0012a42";
		String str7 = "-2147483648";
		System.out.println(sti.myAtoi(str7));
		System.out.println('1');
	}

}
