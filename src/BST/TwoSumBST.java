package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
 * <p>
 * Input: root = [5,3,6,2,4,null,7], k = 9
 * Output: true
 * <p>
 * Input: root = [5,3,6,2,4,null,7], k = 28
 * Output: false
 */
public class TwoSumBST {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return false;
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return ifTargetExist(list, k);
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) {
            dfs(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            dfs(node.right, list);
        }
    }

    private boolean ifTargetExist(List<Integer> list, int k) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == k) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }


}
