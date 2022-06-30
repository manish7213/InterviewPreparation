package BST;

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * <p>
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 * <p>
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 * <p>
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */
public class SortedArrayToBinaryTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) return new TreeNode(nums[0]);
        return TreeBuilder(nums, 0, nums.length - 1);
    }

    private TreeNode TreeBuilder(int[] nums, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = TreeBuilder(nums, start, mid - 1);
            root.right = TreeBuilder(nums, mid + 1, end);
            return root;
        } else return null;
    }

}
