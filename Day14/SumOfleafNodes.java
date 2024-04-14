package Day14;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
public class SumOfleafNodes {
	
	public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (isLeft && node.left == null && node.right == null) {
            // If the node is a left leaf, return its value
            return node.val;
        }
        // Recursively traverse the left and right subtrees
        int leftSum = dfs(node.left, true);
        int rightSum = dfs(node.right, false);
        // Sum up the values from left and right subtrees
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        SumOfleafNodes tree = new SumOfleafNodes();
        System.out.println("Sum of left leaves: " + tree.sumOfLeftLeaves(root)); // Output: 24
    }
	

}
