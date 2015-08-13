package Stack;

import java.util.Stack;

/**
 * Problem number : 150
 * 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation
 * @link https://en.wikipedia.org/wiki/Reverse_Polish_notation
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or expression.
 * 
 * Some examples:
 * 
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * @author mehmet
 *
 */

public class EvaluateReversePolishNotation {
	
	/**
	 * Algorithm:
	 * 1.)Iterate over array
	 * 2.)if the current element is number push to the stack
	 * 3.)if the current element is operator pop stack two times.
	 *    and evaluate those two element with current operator.
	 *    Then push to the stack.
	 * 4.)In the end result is at only element in stack.
	 * 
	 * 
	 */
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String signs = "+-*/";
        
        for(int i = 0; i < tokens.length; i++){
            String operator = tokens[i];
            if(signs.indexOf(operator) != -1){
                Integer secondOperand = stack.pop();
                Integer firstOperand = stack.pop();
                switch (operator){
                    case "+":
                        stack.push(firstOperand + secondOperand);
                        break;
                    case "-":
                        stack.push(firstOperand - secondOperand);
                        break;
                    case "*":
                        stack.push(firstOperand * secondOperand);
                        break;
                    case "/":
                        stack.push(firstOperand / secondOperand);
                        break;
                }
            }
            else {
                stack.push(Integer.parseInt(operator));
            }
        }
        return stack.peek();
    }
	
}
