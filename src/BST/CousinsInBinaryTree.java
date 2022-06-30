package BST;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 * Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
 * <p>
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * <p>
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * <p>
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 */
public class CousinsInBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        TreeNode xParent = null;
        TreeNode yParent = null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);

                    if (node.left.val == x) {
                        xParent = node;
                    }

                    if (node.left.val == y) {
                        yParent = node;
                    }
                }

                if (node.right != null) {
                    queue.offer(node.right);

                    if (node.right.val == x) {
                        xParent = node;
                    }

                    if (node.right.val == y) {
                        yParent = node;
                    }
                }
                if (xParent != null && yParent != null) {
                    return xParent != yParent;
                }
            }

            if ((xParent == null && yParent != null) || (xParent != null && yParent == null)) {
                return false;
            }
        }

        return false;
    }

}
