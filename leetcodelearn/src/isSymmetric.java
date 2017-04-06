import java.util.ArrayList;
import java.util.List;
public class isSymmetric {
	public static void main(String[] args) {
	
	}
	public static boolean isSymmetricorfalse(TreeNode root){
		if (root==null) {
			return false;
		}
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root.left);
		list.add(root.right);
		boolean containsData=true;
		
		while(containsData){
			containsData=false;
			int left = list.size()/2-1;
			int right =left+1;
			List<TreeNode> leftlist = new ArrayList<TreeNode>();
			List<TreeNode> rightlist =  new ArrayList<TreeNode>();
			while(left>=0){
				TreeNode leftNode = list.get(left);
				TreeNode rightNode = list.get(right);
				
				if (leftNode==null&&rightNode==null) {
					left--;
					right++;
					continue;
				}
				
				containsData = true;
				if (leftNode ==null||rightNode ==null||leftNode.val!=rightNode.val) {
					return false;
				}
				
				left--;
				right++;
				
				leftlist.add(0,leftNode.right);
				leftlist.add(0,leftNode.left);
				rightlist.add(rightNode.left);
				rightlist.add(rightNode.right);
				
				
			}
			list.clear();
			list.addAll(leftlist);
			list.addAll(rightlist);
		}
		
		return true;
	}
}
