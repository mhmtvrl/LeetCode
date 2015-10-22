package Tree;

public class SymmetricTree {
	
	//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        else if(left == null || right == null)
            return false;
            
        if(left.val != right.val)
            return false;
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
