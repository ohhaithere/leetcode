package BinaryTreePostorderTraversal;

import java.util.*;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Set<TreeNode> visited = new HashSet<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.peek();
            if (root.left != null && !visited.contains(root.left)) {
                root = root.left;
                stack.push(root);
            } else if (root.right != null && !visited.contains(root.right)) {
                root = root.right;
                stack.push(root);
            } else {
                root = stack.pop();
                visited.add(root);
                result.add(root.val);
            }
        }
        return result;
    }

}
