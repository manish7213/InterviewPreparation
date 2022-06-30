package BST;

/**
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 * Example 2:
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 */

public class MinDepthBST {
    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);

        if (minLeft == 0 || minRight == 0) return 1 + Math.max(minLeft, minRight);

        return 1 + Math.min(minLeft, minRight);

    }


}
