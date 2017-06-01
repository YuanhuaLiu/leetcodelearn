package CodingInterviewGuide_stack;

import java.util.LinkedList;

/*
 * 生成窗口最大值数组(没有弄清楚的)
 * 
 */
public class GetMaxWindow {
	public static void main(String[] args) {
		int arr[]={4,3,5,4,3,3,6,7};
		int []res=getMaxWindow(arr,3);
		for (int i : res) {
			System.out.println(i);
		}
	}
	public static int[]getMaxWindow(int[]arr,int w){
		if (arr==null||w<1||arr.length<w) {
			return null;
		}
		LinkedList<Integer> qmax=new LinkedList<Integer>();
		int[]res =new int[arr.length-w+1];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			while (!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst()==i-w) {
				qmax.pollFirst();
			}
			if (i>=w-1) {
				res[index++]=arr[qmax.peekFirst()];
			}
		}
		return res;
	}
}
