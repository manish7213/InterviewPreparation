package BST;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 * <p>
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 */
public class DiamterOfBST {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        if (root == null) return 0;
        findDiameter(root, res);
        return res[0];
    }

    private int findDiameter(TreeNode node, int[] res) {

        if (node == null) return 0;

        int left = findDiameter(node.left, res);
        int right = findDiameter(node.right, res);

        res[0] = Math.max(res[0], left + right);

        return 1 + Math.max(left, right);
    }

}
