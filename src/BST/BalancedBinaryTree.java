package BST;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * <p>
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 */

public class BalancedBinaryTree {

    boolean isBal = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBal;
    }

    private int height(TreeNode node) {

        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBal = false;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

}
