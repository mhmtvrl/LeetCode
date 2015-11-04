package HashTable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * 
 * Problem #49
 * 
 * Given an array of strings, group anagrams together.

	For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
	Return:

	[
  		["ate", "eat","tea"],
  		["nat","tan"],
  		["bat"]
	]
	Note:
	For the return value, each inner list's elements must follow the lexicographic order.
	All inputs will be in lower-case.
 * @author mehmet
 *
 */

public class GroupAnagram {
	
    public String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    /**
     * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Hashing/code/Anagrams.java
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> words;
        
        for(int i = 0; i < strs.length; i++){
            String sortedWord = this.sortString(strs[i]);
            words = map.get(sortedWord);
            if(words == null){
            	words = new ArrayList<String>();
            }
            words.add(strs[i]);
            map.put(sortedWord, words);
        }
        List<List<String>> list = new ArrayList<List<String>>();
        Set<String> st = map.keySet();
        
        Iterator<String> iter = st.iterator();
        while(iter.hasNext()){
        	List<String> anagrams = map.get(iter.next());
        	Collections.sort(anagrams);
        	list.add(anagrams);
        }       
        return list;
    }
    
    public static void main(String[] args) {
    	GroupAnagram ga = new GroupAnagram();
    	String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    	System.out.println(ga.groupAnagrams(strs).toString());    	
	}

}
