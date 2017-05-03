package Medium;
/*
 * 准备一个快指针和一个慢指针，慢指针每次走一步，快指针每次走两步，如果他们俩碰上，那就存在环；
 * 如果走完了也没碰上，那就不存在环：
 */
public class LinkedListCycle {
	public static void main(String[] args) {
		
	}
	public boolean  hasCycle(ListNode head){
		if (null==head) {
			return false;
		}
		ListNode first =head;
		ListNode second=head;
		while (true) {
			if (null==first.next||null==first.next.next) {
				return false;
			}
			
			first=first.next.next;
			second=second.next;
			if (first==second) {
				return true;
			}
		}
	}
}
