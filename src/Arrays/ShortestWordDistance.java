package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem # 243
 * 
 * Shortest Word Distance
 * 
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * 
 * For example,
 * 
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * 
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * 
 * Note: 
 * 
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 * 
 * @author mehmet
 *
 */
public class ShortestWordDistance {
	
	/**
	 * Not efficient in terms of time complexity and memory.
	 * TODO : Find more efficient solution
	 * 
	 * Don't copy this solution
	 * 
	 * http://www.cnblogs.com/jcliBlogger/p/4704962.html
	 * @param words
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int shortestDistance(String[] words, String word1, String word2) {
        Map<String, List<Integer>> map = new LinkedHashMap<String, List<Integer>>();
        for(int i = 0; i < words.length; i++){
            List<Integer> list = map.get(words[i]);
            if(list == null){
                list = new ArrayList<Integer>();
            }
            list.add(i);
            map.put(words[i], list);
        }
        
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                int difference = Math.abs(list1.get(i) - list2.get(j));
                if(difference < min){
                    min = difference;
                }
            }
        }
        
        return min;
    }
	
}
