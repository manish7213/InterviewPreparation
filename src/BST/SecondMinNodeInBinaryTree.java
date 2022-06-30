package BST;

import java.util.*;

/**
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 * If no such second minimum value exists, output -1 instead.
 * <p>
 * Input: root = [2,2,5,null,null,5,7]
 * Output: 5
 * Explanation: The smallest value is 2, the second smallest value is 5.
 * <p>
 * Input: root = [2,2,2]
 * Output: -1
 * Explanation: The smallest value is 2, but there isn't any second smallest value.
 */
public class SecondMinNodeInBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {

        Set<Integer> set = new HashSet<>();
        dfs(root, set);
        return secondMin(set);
    }

    private void dfs(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            dfs(node.left, set);
        }

        set.add(node.val);

        if (node.right != null) {
            dfs(node.right, set);
        }
    }

    private int secondMin(Set<Integer> set) {
        if (set.size() == 1) return -1;
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(1);
    }

}
