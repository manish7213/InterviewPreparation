package BST;

/**
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * <p>
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * <p>
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = false;

        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
