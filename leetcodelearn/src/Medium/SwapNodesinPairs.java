package Medium;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head){
		if (head==null&&head.next==null) {
			return head;
		}
		ListNode first=null;
		ListNode second = head;
		ListNode third = head.next;
		
		while (third!=null) {
			ListNode x=swap(second,third);
			if (first==null) {
				head=x;
			}else{
				first.next=x;
			}
			
			ListNode temp = second;
            second = third;
            third = temp;
             
            if (third.next==null)
                return head;
            else {
                first = third;
                third = third.next.next;
                second = second.next.next;
            }
        }
 
        return head;
    }
     
    private ListNode swap(ListNode second, ListNode third) {
        second.next = third.next;
        third.next = second;
         
        return third;
    }


}
