package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 * <p>
 * Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
 * Output: true
 * <p>
 * Input: root1 = [1,2,3], root2 = [1,3,2]
 * Output: false
 */

public class LeafSimilarTree {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return haveEqualLeaves(leaves1, leaves2);
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) {
            dfs(node.left, list);
        }
        if (isLeaf(node)) {
            list.add(node.val);
        }
        if (node.right != null) {
            dfs(node.right, list);
        }
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return true;
        return false;
    }

    private boolean haveEqualLeaves(List<Integer> leaves1, List<Integer> leaves2) {
        boolean flag = false;
        if (leaves1.size() != leaves2.size()) return false;

        for (int i = 0, j = 0; i < leaves1.size() && j < leaves2.size(); i++, j++) {
            if (leaves1.get(i) == leaves2.get(j)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


}
