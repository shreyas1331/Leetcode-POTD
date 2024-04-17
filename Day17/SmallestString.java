package Day17;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class SmallestString {
	 String res = null;
	    
	    private void dfs(TreeNode root, StringBuilder sb) {
	        if (root == null) {
	            return;
	        }
	        sb.insert(0, (char)('a' + root.val));
	        if (root.left == null && root.right == null) {
	            if (res == null || res.compareTo(sb.toString()) > 0)
	                res = sb.toString();
	        }
	        dfs(root.left, sb);
	        dfs(root.right, sb);
	        sb.deleteCharAt(0);
	    }
	    
	    public String smallestFromLeaf(TreeNode root) {
	        dfs(root, new StringBuilder());
	        return res;
	    }
	    public static void main(String[] args) {
	        // Creating the input binary tree
	        TreeNode root = new TreeNode(0);
	        root.left = new TreeNode(1);
	        root.right = new TreeNode(2);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	        root.right.left = new TreeNode(3);
	        root.right.right = new TreeNode(4);

	        // Creating an instance of Solution class
	        SmallestString solution = new SmallestString();

	        // Calling the smallestFromLeaf method and printing the result
	        System.out.println(solution.smallestFromLeaf(root));
	    }
}
