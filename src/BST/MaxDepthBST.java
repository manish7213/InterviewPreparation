package BST;

/**
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * <p>
 * Input: root = [1,null,2]
 * Output: 2
 */
public class MaxDepthBST {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        if (root.left != null) {
            leftDepth = maxDepth(root.left);
        }

        if (root.right != null) {
            rightDepth = maxDepth(root.right);
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }

}
