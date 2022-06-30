package BST;

/**
 * Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent. If there are no nodes with an even-valued grandparent, return 0.
 * A grandparent of a node is the parent of its parent if it exists.
 * <p>
 * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * Output: 18
 * Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
 * <p>
 * Input: root = [1]
 * Output: 0
 */
public class SumOfNodeWithEvenValuedGrandParent {

    public int sumEvenGrandparent(TreeNode root) {
        int[] sum = new int[1];
        dfs(root, sum);
        return sum[0];
    }

    private void dfs(TreeNode node, int[] sum) {
        if (node == null) return;

        if (node.left != null) {
            dfs(node.left, sum);
        }
        if (node.left != null && node.val % 2 == 0) {
            if (node.left.left != null) {
                sum[0] += node.left.left.val;
            }
            if (node.left.right != null) {
                sum[0] += node.left.right.val;
            }
        }
        if (node.right != null && node.val % 2 == 0) {
            if (node.right.left != null) {
                sum[0] += node.right.left.val;
            }
            if (node.right.right != null) {
                sum[0] += node.right.right.val;
            }
        }

        if (node.right != null) {
            dfs(node.right, sum);
        }
    }

}
