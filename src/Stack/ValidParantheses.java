package Stack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

/**
 * Problem Number : 20
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
 * determine if the input string is valid.
 * 
 * The brackets must close in the corrent order, "()" and "(){}[]" are all valid
 * but "(]" and "([)]" are not valid
 * 
 * @author mehmet
 *
 */

public class ValidParantheses {
	
	/**
	 * One stack one map is used to solve this problem. 
	 * 1.) Iterate over string
	 * 2.) Push opening paranthesis to stack
	 * 3.) if current string is closing paranthesis and stack's top
	 * 	   is its opening paranthesis pop the stack.
	 * 4.) if it is not return false.
	 * 5.) if stack is empty at the end return true otherwise return false.
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s){
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		Stack<Character> stack = new Stack<Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		for(int i = 0; i < s.length(); i++){
			Character current = s.charAt(i);
			if(map.containsKey(current)){
				stack.push(current);
			}
			else {
				//!stack.isEmpty control is for strings like '}'. Because these 
				//are not valid paranthesis
				if(!stack.isEmpty() && map.get(stack.peek()) == current) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String s = ")";
		if(ValidParantheses.isValid(s)){
			System.out.println("it is valid paranthesis");
		}
		else {
			System.out.println("it is not valid paranthesis");
		}
		
	}
}
