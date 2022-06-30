package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 * <p>
 * <p>
 * Example 2:
 * Input: root = [1,null,3]
 * Output: [1,3]
 * <p>
 * <p>
 * Example 3:
 * Input: root = []
 * Output: []
 */
public class RightSideViewOfBinaryTree {

    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) return List.of();
        List<Integer> list = new LinkedList<>();
        findRightView(root, list, 0);
        return list;
    }

    private void findRightView(TreeNode node, List<Integer> list, int level) {
        if (node == null) return;
        if (list.size() <= level) {
            list.add(level, node.val);
        } else {
            list.set(level, node.val);
        }

        findRightView(node.left, list, level + 1);
        findRightView(node.right, list, level + 1);
    }

    public List<Integer> rightSideView_Approach2(TreeNode root) {

        if (root == null) return List.of();
        List<Integer> list = new LinkedList<>();
        findRightView(root, list, 0);
        return list;
    }

    private void findRightView_Approach2(TreeNode node, List<Integer> list, int level) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> levels = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> eachLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                eachLevel.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            levels.add(eachLevel);
        }
        for (List<Integer> list1 : levels) {
            list.add(list1.get(list1.size() - 1));
        }
    }


}
