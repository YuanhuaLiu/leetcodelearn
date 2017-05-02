package Medium;

import easy.ListNode;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(4);
		ListNode l2=new ListNode(9);
		l2.next=new ListNode(4);
		AddTwoNumbers at=new AddTwoNumbers();
		ListNode head =at.addTwoNumbers(l1, l2);
		while (head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		int carry=0;
		ListNode n1=l1;
		ListNode n2=l2;
		ListNode head=null;
		ListNode result=null;
		
		while(n1!=null||n2!=null){
			int sum=carry;
			if (n1!=null) {
				sum+=n1.val;
				n1=n1.next;
			}
			if (n2!=null) {
				sum+=n2.val;
				n2=n2.next;
			}
			if (sum/10>0) {
				carry=1;
			}else{
				carry=0;
			}
			sum=sum%10;
			ListNode item=new ListNode(sum);
			if (result==null) {
				head = item;
			}else{
				result.next=item;
			}
			result=item;
		}
		if (carry!=0) {
			result.next=new ListNode(1);
		}
		return head;
	}
}
