package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 * Example 2:
 * Input: root = []
 * Output: []
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 */

public class PostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    private void postOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        if (node.left != null) {
            postOrder(node.left, list);
        }
        if (node.right != null) {
            postOrder(node.right, list);
        }

        list.add(node.val);
    }

}
