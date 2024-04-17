package Day16;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class AddoneLevel {
	public void solve(TreeNode root, int val, int depth, int level) {
        if (root == null || level > depth) {
            return;
        }
        if (level == depth - 1) {
            TreeNode templ = root.left;
            TreeNode tempr = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = templ;
            root.right.right = tempr;
        }
        solve(root.left, val, depth, level + 1);
        solve(root.right, val, depth, level + 1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode ans = new TreeNode(val);
            ans.left = root;
            return ans;
        }
        solve(root, val, depth, 1);
        return root;
    }
    public static void main(String[] args) {
        // Example usage:
        // Creating the binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);

        AddoneLevel solution = new AddoneLevel();
        int valToAdd = 1; // Value to add
        int depthToAdd = 2; 

        TreeNode result = solution.addOneRow(root, valToAdd, depthToAdd);

        printTree(result);
    }
    public static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
}
