class TreeUnbalancedException extends RuntimeException {
    public TreeUnbalancedException(String msg) {
        super(msg);
    }
}
public class BalancedBinaryTree {
	public static void main(String[] args) {
		
	}
	public boolean isBalanced(TreeNode root) {
        try {
            checkBalanced(root);
        } catch (TreeUnbalancedException e) {
            return false;
        }
        return true;
    }
     
    private int checkBalanced(TreeNode root){
        if (root==null)
            return 0;
        int left = checkBalanced(root.left);
        int right = checkBalanced(root.right);
         
        if(left-right<-1 || left-right>1)
            throw new TreeUnbalancedException( "" + (left-right) );
         
        if (left>=right)
            return left+1;
        else
            return right+1;
    }
	
}
