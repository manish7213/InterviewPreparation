package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
 * <p>
 * Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 * <p>
 * Input: root = [5,1,7]
 * Output: [1,null,5,null,7]
 */
public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        System.out.println(list);
        TreeNode res = createIncOrderSearchTree(list);
        return res;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) {
            inorder(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            inorder(node.right, list);
        }
    }

    private TreeNode createIncOrderSearchTree(List<Integer> list) {
        TreeNode root = new TreeNode(list.get(0));
        TreeNode node = root;
        for (int i = 1; i < list.size(); i++) {
            node.right = new TreeNode(list.get(i));
            node.left = null;
            node = node.right;
        }

        return root;
    }

}
