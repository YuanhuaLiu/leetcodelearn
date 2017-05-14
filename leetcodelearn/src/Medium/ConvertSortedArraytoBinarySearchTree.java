package Medium;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num){
		if (num==null) {
			return null;
		}
		
		return buildTree(num,0,num.length-1);
	}

	private TreeNode buildTree(int[] num, int start, int end) {
		if (end<start) {
			return null;
		}
		int mid=(start+end)/2;
		TreeNode root  = new TreeNode(num[mid]);
		root.left=buildTree(num, start, mid-1);
		root.right=buildTree(num, mid+1, end);
		return root;
	}
}
