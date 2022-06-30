package BST;

/**
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 * <p>
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 * <p>
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 */
public class SubtreeOfBST {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode node, TreeNode subRoot) {

        if (node == null && subRoot == null) return true;
        if (node == null || subRoot == null) return false;

        if (node.val != subRoot.val) return false;

        return node.val == subRoot.val && isSame(node.left, subRoot.left) && isSame(node.right, subRoot.right);
    }

}
