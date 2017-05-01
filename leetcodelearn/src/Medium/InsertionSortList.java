package Medium;
/*
 * 新建一个头结点。依次进行判断，然后插入
 */
class ListNode{
	ListNode next;
	int value;
	public ListNode(int value) {
		this.value = value;
	}
}
public class InsertionSortList {
	public static void main(String[] args) {
		ListNode n1=new ListNode(2);
		n1.next=new ListNode(1);
		n1.next.next=new ListNode(3);
		InsertionSortList iSortList=new InsertionSortList();
		ListNode head =	iSortList.insertionSortList(n1);
		while(head!=null){
			System.out.print(head.value);
			head=head.next;
		}
		
	}
	public  ListNode insertionSortList(ListNode head){
		ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
		ListNode cur=head;
		while (cur!=null) {
			ListNode next = cur.next;
			insert(fakeHead,cur);
			cur=next;
		}
		return fakeHead.next;
	}

	private void insert(ListNode fakeHead, ListNode cur) {
		
		ListNode node=fakeHead;
		while (node.next!=null&&node.next.value<cur.value) {
			node=node.next;
		}
		cur.next=node.next;
		node.next=cur;
	}
}
