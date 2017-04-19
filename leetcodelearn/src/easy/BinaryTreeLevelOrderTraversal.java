package easy;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	
	public static void main(String[] args) {
		
	}
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> list =  new ArrayList<List<Integer>>();
	        if (root==null)
	            return list;
	         
	        List<TreeNode> level = new ArrayList<TreeNode>();
	        level.add(root);
	         
	        while (true) {
	            List<TreeNode> newLevel = new ArrayList<TreeNode>();
	            List<Integer> item = new ArrayList<Integer>();
	            for (TreeNode node : level) {
	                item.add(node.val);
	                 
	                if (node.left!=null)
	                    newLevel.add(node.left);
	                if (node.right!=null)
	                    newLevel.add(node.right);
	            }
	            list.add(item);
	            if (newLevel.isEmpty())
	                break;
	            level = newLevel;
	        } // while
	         
	        return list;
	    }
}
