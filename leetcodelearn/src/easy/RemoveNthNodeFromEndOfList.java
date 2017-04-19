package easy;
import java.util.Stack;


public class RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode node = head;
        while (node!=null) {
            stack.push(node);
            node = node.next;
        }
         
        ListNode n1 = null;
        ListNode n2 = null;
        while (n>0) {
            n2 = n1;
            n1 = stack.pop();
            n--;
        }
         
        if (stack.empty())
            head = n2;
        else
            stack.peek().next = n2;
         
        return head;
    }
}
