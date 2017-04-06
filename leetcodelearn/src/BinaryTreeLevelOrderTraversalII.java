import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	public static void main(String[] args) {
		
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (null==root)
            return list;
             
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
         
        traverseLevel(list, nodes);
         
        return list;
    }
     
    private void traverseLevel(List<List<Integer>> list, List<TreeNode> nodes) {
        List<Integer> item = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
        for (TreeNode node : nodes) {
            item.add(node.val);
            if (node.left!=null)
                nextLevel.add(node.left);
            if (node.right!=null)
                nextLevel.add(node.right);
        }
        if (!nextLevel.isEmpty())
            traverseLevel(list, nextLevel);
         
        list.add(item);
    }
}
