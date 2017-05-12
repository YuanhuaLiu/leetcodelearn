package Medium;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListtoBinarySeachTree {
	public TreeNode sortedListToBST(ListNode head){
		if (null==head) {
			return null;
		}
		List<TreeNode> list = new ArrayList<TreeNode>();
		ListNode node = head;
		while (node!=null) {
			TreeNode n = new TreeNode(node.value);
			list.add(n);
			node=node.next;
		}
		return buildTree(0,list.size()-1,list);
	}

	private TreeNode buildTree(int start, int end, List<TreeNode> list) {
		int mid=(start+end)/2;
		TreeNode root = list.get(mid);
		if (start<=mid-1) {
			root.left=buildTree(start, mid-1, list);
		}
		if (end>=mid+1) {
			root.right=buildTree(mid+1,end, list);
		}
		return root;
	}
}
