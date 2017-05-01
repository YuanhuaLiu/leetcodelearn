package Medium;
class InvalidBSTException extends RuntimeException {
}
class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
}
public class ValidateBinarySearchTree {
	 public boolean isValidBST(TreeNode root) {
	        if (null==root)
	            return true;
	         
	        try {
	            validateBST(root);
	        } catch (InvalidBSTException e) {
	            return false;
	        }
	             
	        return true;
	    }
	     
	    private int maxValueOfValidBST(TreeNode root) {
	        validateBST(root);
	         
	        if (root.right!=null) {
	            return maxValueOfValidBST(root.right);
	        }
	         
	        return root.val;
	    }
	     
	    private int minValueOfValidBST(TreeNode root) {
	        validateBST(root);
	         
	        if (root.left!=null) {
	            return minValueOfValidBST(root.left);
	        }
	         
	        return root.val;
	    }
	     
	    private void validateBST(TreeNode root) {
	        if (root.left!=null) {
	            int maxLeft = maxValueOfValidBST(root.left);
	            if (maxLeft>=root.val)
	                throw new InvalidBSTException();
	        }
	        if (root.right!=null) {
	            int minRight = minValueOfValidBST(root.right);
	            if (minRight<=root.val)
	                throw new InvalidBSTException();
	        }
	    }
}
