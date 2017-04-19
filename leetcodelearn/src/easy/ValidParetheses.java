package easy;
import java.util.Stack;

public class ValidParetheses {
	public static void main(String[] args) {
		String string="([])(){}";
		System.out.println(isValid(string));
	}
	public static boolean isValid(String s){
		 Stack<Character> stack = new Stack<Character>();
	        for (int i=0; i<s.length(); i++) {
	            char ch = s.charAt(i);
	             
	            if (ch=='(' || ch=='[' || ch=='{')
	                stack.push(ch);
	             
	            if (ch==')' && (stack.empty() || stack.pop()!='('))
	                return false;
	             
	            if (ch==']' && (stack.empty() || stack.pop()!='['))
	                return false;
	             
	            if (ch=='}' && (stack.empty() || stack.pop()!='{'))
	                return false;
	                 
	        } // for
	         
	        if (!stack.empty())
	            return false;
	             
	        return true;
	}
}
