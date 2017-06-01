package CodingInterviewGuide_stack;

import java.util.Stack;

/*
 * 用一个栈实现另一个栈的排序
 */
public class SortStackByStack {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		sortStackByStack(stack);
		while(!stack.empty()){
			System.out.print(stack.pop());
		}
	}
	public static void sortStackByStack(Stack<Integer> stack){
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int cur=stack.pop();
			while (!help.isEmpty()&&help.peek()>cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
}
