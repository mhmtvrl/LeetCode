package Tree;

public class InvertBinaryTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode invertTree(TreeNode root) {
        if(root != null){
            invertTree(root.left);
            invertTree(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            return root;
        }
        else
            return null;       
    }

}
