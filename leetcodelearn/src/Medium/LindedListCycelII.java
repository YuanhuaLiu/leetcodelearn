package Medium;
/* 找环的入口
 * 快指针每次走两步，慢指针每次走一步，快慢两个指针第一次碰面以后，让慢指针退回起点；
        然后快指针和慢指针每次都走一步，它们碰面的地方，就是这个环的入口
 */
public class LindedListCycelII {
	public ListNode detectCycle(ListNode head){
		if (null==head) {
			return null;
		}
		ListNode x=head;
		ListNode y=head;
		do {
			x=x.next;
			y=y.next;
			if (y==null) {
				return null;
			}
			y=y.next;
			if (y==null) {
				return null;
			}
		} while (x!=y);
		if (head==x) {
			return head;
		}
		x=head;
		do {
			x=x.next;
			y=y.next;
		} while (x!=y);
		
		
		return x;
		
	}
}
