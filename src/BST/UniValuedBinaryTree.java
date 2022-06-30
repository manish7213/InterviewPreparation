package BST;

import java.util.HashSet;
import java.util.Set;

/**
 * A binary tree is uni-valued if every node in the tree has the same value.
 * Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
 * <p>
 * Input: root = [1,1,1,1,1,null,1]
 * Output: true
 * <p>
 * Input: root = [2,2,2,5,2]
 * Output: false
 */
public class UniValuedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        Set<Integer> set = new HashSet<>();
        dfs(root, set);

        return set.size() == 1;
    }

    private void dfs(TreeNode node, Set<Integer> set) {
        if (node == null) return;
        if (node.left != null) {
            dfs(node.left, set);
        }

        set.add(node.val);

        if (node.right != null) {
            dfs(node.right, set);
        }
    }


}
