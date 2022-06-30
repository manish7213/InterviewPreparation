package BST;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * <p>
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * <p>
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode p, TreeNode q) {
        boolean flag = false;

        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;

        return p.val == q.val && isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
    }

}
