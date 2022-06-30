package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children
 * <p>
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 * <p>
 * Input: root = [1]
 * Output: ["1"]
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }

    private void dfs(TreeNode node, String path, List<String> list) {

        if (node == null) return;

        path += String.valueOf(node.val);

        if (node.left == null && node.right == null) {
            list.add(path);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path + "->", list);
        }

        if (node.right != null) {
            dfs(node.right, path + "->", list);
        }
    }

}
