package String;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        return isPalindromeIterative(replaceWithAllCharsAndMakeAllLoweCase(s));
    }
    
    public String replaceWithAllCharsAndMakeAllLoweCase(String str){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length(); i++){
			if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
				sb.append(str.charAt(i));
			}
		}
		return sb.toString().toLowerCase();
	}
	
	public boolean isPalindromeIterative(String str){
		for(int i = 0; i < str.length() / 2; i++){
			if(str.charAt(i) != str.charAt(str.length() - i - 1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindromeRecursive(String str){
		if(str.length() < 2)
			return true;
		
		if(str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		else
			return isPalindromeRecursive(str.substring(1, str.length() - 1));
	}
}
