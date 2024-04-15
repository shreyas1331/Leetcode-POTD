package Day15;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class SumRoot_leafNodes {
	public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    private int sumNumbersHelper(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return currentSum;
        }

        int leftSum = sumNumbersHelper(node.left, currentSum);
        int rightSum = sumNumbersHelper(node.right, currentSum);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        SumRoot_leafNodes solution = new SumRoot_leafNodes();
        System.out.println("Sum of root-to-leaf numbers: " + solution.sumNumbers(root)); // Output should be 25 (12 + 13)
    }
}
