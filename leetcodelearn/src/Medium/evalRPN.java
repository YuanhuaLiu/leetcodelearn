package Medium;

import java.util.Stack;

public class evalRPN {
	 public int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<>();
	        for (String token : tokens) {
	            if (token.matches("[+-]{0,1}\\d+")) {
	                stack.push(Integer.parseInt(token));
	            } else {
	                int right = stack.pop();
	                int left = stack.pop();
	                 
	                int result;
	                if ("+".equals(token))
	                    result = left + right;
	                else if ("-".equals(token))
	                    result = left - right;
	                else if ("*".equals(token))
	                    result = left * right;
	                else
	                    result = left / right;
	                 
	                stack.push(result);
	            }
	        }
	         
	        if (stack.isEmpty())
	            return 0;
	        return stack.pop();
	    }
}
