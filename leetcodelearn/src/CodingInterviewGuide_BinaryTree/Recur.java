package CodingInterviewGuide_BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Recur {
	//二叉树，采用递归的方式
	public void preOrderRecur(Node head){
		if (head==null){
			return;
		}
		System.out.println(head.value+" ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	public void inOrderRecur(Node head){
		if (head==null){
			return;
		}
		inOrderRecur(head.left);
		System.out.println(head.value+" ");
		inOrderRecur(head.right);
	}
	public void posOrderRecur(Node head){
		if (head==null){
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.println(head.value+" ");
	}
	//采用非递归方式
	public void preOrderUnRecur(Node head){
		System.out.println("pre-order:");
		if (head!=null){
			Stack<Node> stack=new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()){
				head=stack.pop();
				System.out.println(head.value+" ");
				if(head.right!=null){
					stack.push(head.right);
				}
				if(head.left!=null){
					stack.push(head.left);
				}
			}
		}
		System.out.println();
	}
	public void inOrderUnRecur(Node head){
		System.out.println("in-order:");
		if(head!=null){
			Stack<Node>stack=new Stack<Node>();
			while(!stack.isEmpty()||head!=null){
				if(head!=null){
					stack.push(head);
					head=head.left;
				}else{
					head=stack.pop();
					System.out.println(head.value+" ");
					head=head.right;
				}
			}
		}
	}
	public void posOrderUnRecur1(Node head){
		System.out.println("pos-order:");
		if(head !=null){
			Stack<Node>s1=new Stack<Node>();
			Stack<Node>s2=new Stack<Node>();
			s1.push(head);
			while(!s1.isEmpty()){
				head=s1.pop();
				s2.push(head);
				if (head.left!=null){
					s1.push(head.left);
				}
				if(head.right!=null){
					s1.push(head.right);
				}
			}
			while(!s2.isEmpty()){
				System.out.println(s2.pop().value+" ");
			}
		}
		System.out.println();
	}
	public void posOrderUnRecur2(Node h){
		System.out.println("pos-order");
		if (h!=null){
			Stack<Node>stack=new Stack<Node>();
			stack.push(h);
			Node c=null;
			while(!stack.isEmpty()){
				c=stack.peek();
				if(c.left!=null&&h!=c.left&&h!=c.right){
					stack.push(c.left);
				}else if(c.right!=null&&h!=c.right){
					stack.push(c.right);
				}else{
					System.out.println(stack.pop().value+" ");
					h=c;
				}
			}
		}
		System.out.println();
	}
	//求二叉树的深度
	public int deep(Node node){
		int h1,h2;
		if (node==null){
			return 0;
		}else{
			h1=deep(node.left);
			h2=deep(node.right);
			return (h1<h2)?h2+1:h1+1;
		}
	}
	 // 层次遍历  
    public static void levelOrder(Node node) {  
        if (node == null)  
            return;  
        Queue<Node> queue = new ArrayDeque<Node>();  
        queue.add(node);  
        while (!queue.isEmpty()) {  
            Node temp = queue.poll();  
            System.out.print(temp.value);  
            if (temp.left != null)  
                queue.add(temp.left);  
            if (temp.right != null)  
                queue.add(temp.right);  
        }  
    }  
	
}
