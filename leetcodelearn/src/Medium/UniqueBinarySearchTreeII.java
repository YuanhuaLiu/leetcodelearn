package Medium;

import java.util.ArrayList;
import java.util.List;
/*
 * ¶þ²æËÑË÷Ê÷
 */
public class UniqueBinarySearchTreeII {
	public static void main(String[] args) {
		UniqueBinarySearchTreeII uniqueBi=new UniqueBinarySearchTreeII();
		List<TreeNode> list = uniqueBi.generateTrees(3);
		for(TreeNode tn:list){
			System.out.println(tn.value);
		}
	}
	public List<TreeNode> generateTrees(int n) {
        if (n==0) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            list.add(null);
            return list;
        }
        return generateTreesByNumberRange(1, n);
    }
     
    private List<TreeNode> generateTreesByNumberRange(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start==end) {
            list.add(new TreeNode(start));
            return list;
        }
         
        for (int i=start; i<=end; i++) {
            List<TreeNode> left = null;
            if (i!=start) {
                left = generateTreesByNumberRange(start, i-1);
            }
             
            List<TreeNode> right = null;
            if (i!=end) {
                right = generateTreesByNumberRange(i+1, end);
            }
             
            if (left==null) {
                for (TreeNode node : right) {
                    TreeNode root = new TreeNode(i);
                    root.right = node;
                    list.add(root);
                }
            } else if (right==null) {
                for (TreeNode node : left) {
                    TreeNode root = new TreeNode(i);
                    root.left = node;
                    list.add(root);
                }
            } else {
                for (TreeNode n1 : left) {
                    for (TreeNode n2 : right) {
                        TreeNode root = new TreeNode(i);
                        root.left = n1;
                        root.right = n2;
                        list.add(root);
                    }
                } // for
            } // else
        } // for
         
        return list;
    }
}
