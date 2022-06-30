package BST;

import java.util.*;

public class ModeInBST {

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = dfs(root, list);
        System.out.println(list);
        return getMode(list);
    }

    private List<Integer> dfs(TreeNode node, List<Integer> list) {
        if (node == null) return List.of();
        list.add(node.val);
        if (node.left != null) {
            list = dfs(node.left, list);
        }
        if (node.right != null) {
            list = dfs(node.right, list);
        }

        return list;
    }

    private int[] getMode(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : list) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        Integer max = Collections.max(map.values());

        int frequency = Collections.frequency(map.values(), max);

        System.out.println("Max is : " + max + "Frequency : " + frequency);
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                res.add(entry.getKey());
            }
        }

        System.out.println(res);
        int i = 0;
        int[] arr = new int[res.size()];
        for (Integer num : res) {
            arr[i++] = num;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
