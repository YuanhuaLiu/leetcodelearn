package Medium;
/* �һ������
 * ��ָ��ÿ������������ָ��ÿ����һ������������ָ���һ�������Ժ�����ָ���˻���㣻
        Ȼ���ָ�����ָ��ÿ�ζ���һ������������ĵط�����������������
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
