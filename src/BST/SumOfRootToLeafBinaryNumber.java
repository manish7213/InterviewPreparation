package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.
 * •	For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.
 * The test cases are generated so that the answer fits in a 32-bits integer.
 * <p>
 * Input: root = [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * Example 2:
 * Input: root = [0]
 * Output: 0
 */
public class SumOfRootToLeafBinaryNumber {

    public int sumRootToLeaf(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        int n = convertToDecimalSum(list);
        return n;
    }

    private void dfs(TreeNode node, String path, List<String> list) {
        if (node == null) {
            return;
        }

        path += String.valueOf(node.val);

        if (node.left == null && node.right == null) {
            list.add(path);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path, list);
        }

        if (node.right != null) {
            dfs(node.right, path, list);
        }
    }

    private int convertToDecimalSum(List<String> list) {
        int sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s, 2);
        }
        return sum;
    }

}
