package Medium;
/*
 * ׼��һ����ָ���һ����ָ�룬��ָ��ÿ����һ������ָ��ÿ����������������������ϣ��Ǿʹ��ڻ���
 * ���������Ҳû���ϣ��ǾͲ����ڻ���
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
