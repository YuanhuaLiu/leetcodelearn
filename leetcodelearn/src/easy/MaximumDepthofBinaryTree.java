package easy;

public class MaximumDepthofBinaryTree {
	 int max = 0;
	    public int maxDepth(TreeNode root) {
	        if (null==root)
	            return 0;
	             
	        traverse(root, 1);
	        return max;
	    }
	     
	    private void traverse(TreeNode root, int depth) {
	        if (depth >= max)
	            max = depth;
	        if (null != root.left)
	            traverse(root.left, depth+1);
	        if (null != root.right)
	            traverse(root.right, depth+1);
	    }
}
