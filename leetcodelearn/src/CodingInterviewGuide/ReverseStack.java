package CodingInterviewGuide;

import java.util.Stack;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/*
 * 如何仅用递归函数和栈操作逆序一个栈
 * 
 * 
 */
public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		reverse(stack);
		System.out.println();
		while(!stack.empty()){
			System.out.print(stack.pop());
		}
	}
	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int reslut = stack.pop();
		if (stack.isEmpty()) {
			return reslut;
		}else{
			int last=getAndRemoveLastElement(stack);
			stack.push(reslut);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if (stack.isEmpty()) {
			return;
		}
		int i =getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
}
