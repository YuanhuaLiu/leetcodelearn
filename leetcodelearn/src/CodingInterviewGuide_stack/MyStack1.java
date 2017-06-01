package CodingInterviewGuide_stack;

import java.util.Stack;

/*
 * 设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，在实现返回栈中最小元素的操作
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    
    public MyStack1(){
    	this.stackData=new Stack<Integer>();
    	this.stackMin=new Stack<Integer>();
    }
    
    public void push(int newNum){
    	if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		}else if (newNum<=this.getMin()) {
			this.stackMin.push(newNum);
		}
    	
    	this.stackData.push(newNum);
    }
    
    
    public int pop(){
    	if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty");
		}
    	int value =this.stackData.pop();
    	if (value==this.getMin()) {
			this.stackMin.pop();
		}
    	return value;
    }
    
    
    public int getMin(){
    	if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your Stack is Empty");
		}
    	
    	return this.stackMin.peek();
    }
}
