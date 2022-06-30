package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 * Example 2:
 * Input: root = []
 * Output: []
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void preOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);
        if (node.left != null) {
            preOrder(node.left, list);
        }

        if (node.right != null) {
            preOrder(node.right, list);
        }

    }

}
