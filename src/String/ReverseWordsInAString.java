package String;

import java.util.Arrays;

public class ReverseWordsInAString {
	
	public static String reverseWords(String s){
		String str[] = s.split("\\s+");
		System.out.println(Arrays.toString(str));
		for(int i = 0; i < str.length / 2; i++){
			String temp = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(str));
		StringBuffer sb = new StringBuffer();
		System.out.println("a" + str.length);
		for(int i = 0; i < str.length - 1; i++){
			if(!str[i].equals(" "))
				sb.append(str[i] + " ");
		}
		if(str.length != 0){
			System.out.println("x" + str[str.length - 1]);
			sb.append(str[str.length - 1]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "the sky is blue";
		String str2 = " 1";
		System.out.println(reverseWords(str));
		System.out.println(reverseWords(str2));

	}
}
