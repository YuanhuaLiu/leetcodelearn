package Medium;

class TreeNode{
	TreeNode left;
	TreeNode right;
}

public class FlattenBinaryTreeToLinkedList {
	public static void main(String[] args) {
		
	}
	public void flaten(TreeNode root){
		if (root!=null) {
			Traverse(root);
		}
	}
	private TreeNode Traverse(TreeNode root) {
		TreeNode right=root.right;
		TreeNode left=root.left;
		TreeNode tail=root;
		root.left=null;
		root.right=null;
		if (null!=left) {
			root.left=left;
			tail=Traverse(left);
		}
		if (null!=right) {
			tail.right=right;
			tail=Traverse(root.right);
		}
		tail.left=null;
		tail.right=null;
		return tail;
	}
}
