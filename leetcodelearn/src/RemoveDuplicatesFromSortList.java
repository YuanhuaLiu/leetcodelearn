
public class RemoveDuplicatesFromSortList {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(null==head)
	            return null;
	         
	        ListNode current = head, moving = head.next;
	        while (null!=moving) {
	            if (moving.val==current.val) {
	                moving = moving.next;
	                if (moving==null)
	                    current.next = null;
	            }
	            else {
	                if (current.next!=moving)
	                    current.next = moving;
	                 
	                current = moving;
	                moving = moving.next;
	            }
	        }
	         
	        return head;
	    }
}
