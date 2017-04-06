
public class IsSameTree {
	public static void main(String[] args) {
		
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
        // only one node is null
        if (p==null && q!=null)
            return false;
        if (p!=null && q==null)
            return false;
 
        // two nodes are both null
        if (p==null && q==null)
            return true;
         
        // val
        if (p.val!=q.val)
            return false;
 
        // neither node is null
        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
            return true;
         
        return false; //p!=q
    }
}
