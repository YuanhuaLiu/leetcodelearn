package CodingInterviewGuide;

import java.util.Stack;

/*
 * 由两个栈组成的队列
 * 
 * 编写一个类，用两个栈实现队列，支持队列的基本的操作（add poll peek）
 */
public class TwoStacksQuence {
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	
	public TwoStacksQuence(){
		stackPush=new Stack<Integer>();
		stackPop=new Stack<Integer>();
	}
	
	public void add(int pushInt){
		stackPush.push(pushInt);
	}
	
	public int poll(){
		if (stackPop.empty()&&stackPush.empty()) {
			throw new RuntimeException("Quenue is empty!");
		}else if (stackPop.empty()) {
			
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	public int peek(){
		if (stackPop.empty()&&stackPush.empty()) {
			throw new RuntimeException("Quenue is empty!");
		}else if (stackPop.empty()) {
			
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}
