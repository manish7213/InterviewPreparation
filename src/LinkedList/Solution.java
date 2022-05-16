package LinkedList;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return List.of();
        List<List<Integer>> list = new ArrayList<>();
        bfs(root, list);
        return list;
    }

    private void bfs(TreeNode node, List<List<Integer>> list) {

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
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
            stack.push(eachLevel);
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }
}






































