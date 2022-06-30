package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * •	The left subtree of a node contains only nodes with keys less than the node's key.
 * •	The right subtree of a node contains only nodes with keys greater than the node's key.
 * •	Both the left and right subtrees must also be binary search trees.
 * <p>
 * Input: root = [2,1,3]
 * Output: true
 * <p>
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsIn(root, list);
        return isValid(list);
    }

    private void dfsIn(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) {
            dfsIn(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            dfsIn(node.right, list);
        }
    }

    private boolean isValid(List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }


}
