package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 * Input: root = []
 * Output: []
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;

    }

    private void inorder(TreeNode root, List<Integer> list) {

        if (root != null) {
            if (root.left != null) {
                inorder(root.left, list);
            }

            list.add(root.val);

            if (root.right != null) {
                inorder(root.right, list);
            }
        }
    }

}
