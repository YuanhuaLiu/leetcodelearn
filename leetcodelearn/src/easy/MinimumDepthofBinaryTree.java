package easy;
import java.util.ArrayList;
import java.util.List;

public class MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
        if (null==root)
            return 0;
         
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
         
        int depth = 1;
        while (true) {
            List<TreeNode> newList = new ArrayList<TreeNode>();
            for (TreeNode node : list) {
                if (node.left==null && node.right==null)
                    return depth;
                 
                if (null!=node.left)
                    newList.add(node.left);
                if (null!=node.right)
                    newList.add(node.right);
            }
                             
            list = newList;
            depth++;
        }
    }
}
