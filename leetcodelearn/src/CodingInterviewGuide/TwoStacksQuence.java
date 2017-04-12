package CodingInterviewGuide;

import java.util.Stack;

/*
 * ������ջ��ɵĶ���
 * 
 * ��дһ���࣬������ջʵ�ֶ��У�֧�ֶ��еĻ����Ĳ�����add poll peek��
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
