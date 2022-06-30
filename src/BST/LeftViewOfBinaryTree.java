package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    public List<Integer> leftSideView(TreeNode root) {

        if (root == null) return List.of();
        List<Integer> list = new LinkedList<>();
        findLeftView(root, list, 0);
        return list;
    }

    private void findLeftView(TreeNode node, List<Integer> list, int level) {
        if (node == null) return;
        if (list.size() == 0) {
            list.add(level, node.val);
        }

        findLeftView(node.left, list, level + 1);
        findLeftView(node.right, list, level + 1);
    }



    public List<Integer> leftSideView_Approach2(TreeNode root) {

        if (root == null) return List.of();
        List<Integer> list = new LinkedList<>();
        findLeftView(root, list, 0);
        return list;
    }

    private void findLeftView_Approach2(TreeNode node, List<Integer> list, int level) {
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
            list.add(list1.get(0));
        }
    }


}
