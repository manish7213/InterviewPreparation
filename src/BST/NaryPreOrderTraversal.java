package BST;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 * <p>
 * <p>
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 * <p>
 * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 */
public class NaryPreOrderTraversal {

    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private void dfs(Node node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        for (int i = 0; i < node.children.size(); i++) {
            dfs(node.children.get(i), list);
        }
    }

}
