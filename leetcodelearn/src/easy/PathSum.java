package easy;
import java.util.ArrayList;
import java.util.List;

public class PathSum {
	 public boolean hasPathSum(TreeNode root, int sum) {
	        if (null==root)
	            return false;
	             
	        List<Integer> list = calculate(root, sum);
	        return list.contains(sum);
	    }
	     
	    private static List<Integer> calculate(TreeNode root, int sum) {
	        List<Integer> list = new ArrayList<Integer>();
	        if (root.left!=null) {
	            for (int num : calculate(root.left, sum)){
	                num += root.val;
	                list.add(num);
	            }
	        }
	        if (root.right!=null) {
	            for (int num : calculate(root.right, sum)){
	                num += root.val;
	                list.add(num);
	            }
	        }
	        if (root.left==null&&root.right==null){
	            list.add(root.val);
	        }
	        return list;
	    }
}
