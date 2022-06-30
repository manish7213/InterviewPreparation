package BST;

/**
 * Given the root of a binary tree, return the sum of all left leaves. A leaf is a node with no children. A left leaf is a leaf that is the left child of another node
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 24
 * Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 * <p>
 * Input: root = [1]
 * Output: 0
 */

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) return 0;
        if (isLeaf(root.left)) {
            sum += root.left.val;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }

        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    private boolean isLeaf(TreeNode node) {

        if (node == null) return false;
        if (node.right == null && node.left == null) return true;
        return false;
    }


}
