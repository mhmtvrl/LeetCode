package Tree;

public class BalancedBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public int height(TreeNode root){
        if(root == null)
            return 0;
        else
            return 1 + Math.max(height(root.right), height(root.left));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        int rightSubtreeHeight = height(root.right);
        int leftSubtreeHeight = height(root.left);
        int differenceBetweenTwoSubtree = Math.abs(rightSubtreeHeight - leftSubtreeHeight);
        if(differenceBetweenTwoSubtree <= 1 && isBalanced(root.right) && isBalanced(root.left))
            return true;
        return false;
    }
}
