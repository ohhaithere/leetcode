package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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


        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode current = root;
            while (current != null || !stack.isEmpty()) {
                while (current != null) {
                    result.add(current.val);
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop().right;
            }

            return result;
        }

}
