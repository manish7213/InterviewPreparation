package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
 * <p>
 * Input: root = [4,2,6,1,3]
 * Output: 1
 * <p>
 * Input: root = [1,0,48,null,null,12,49]
 * Output: 1
 */

public class MinAbsDiffInBST {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        System.out.println(list);
        int minDiff = findMinDiff(list);
        return minDiff;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            inorder(node.left, list);
        }
        list.add(node.val);

        if (node.right != null) {
            inorder(node.right, list);
        }

    }

    private int findMinDiff(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Math.abs(list.get(i) - list.get(j)) < min) {
                    min = Math.abs(list.get(i) - list.get(j));
                }
            }
        }

        return min;
    }


}
