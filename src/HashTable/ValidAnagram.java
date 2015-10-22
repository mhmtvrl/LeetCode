package HashTable;

import java.util.HashMap;

public class ValidAnagram {
	
	public boolean isAnagram2(String s, String t) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++){
			if(map1.containsKey(s.charAt(i))){
				int frequency = map1.get(s.charAt(i));
				map1.put(s.charAt(i), ++frequency);
			}
			else {
				map1.put(s.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < t.length(); i++){
			if(map2.containsKey(t.charAt(i))){
				int frequency = map2.get(t.charAt(i));
				map2.put(t.charAt(i), ++frequency);
			}
			else {
				map2.put(t.charAt(i), 1);
			}
		}
		
        return map1.equals(map2);
    }
	
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[26];
		
		for(int i = 0; i < s.length(); i++){
			letters[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < t.length(); i++){
			if(--letters[t.charAt(i) - 'a'] < 0){
				return false;
			}
		}
		return true;
    }
	
	
	
	public static void main(String[] args) {
		String s1 = "anagram";
		String t1 = "nagaram";
		String s2 = "rat";
		String t2 = "car";
		
		ValidAnagram va = new ValidAnagram();
		System.out.println(va.isAnagram(s1, t1));
		
		
	}
}
