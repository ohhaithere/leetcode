package DepthOfBinaryTree;

public class Solution {

  public int maxDepth(TreeNode root) {
    if(root == null) return 0;

    int left = maxDepth(root.left) + 1;
    int right = maxDepth(root.right) + 1;

    return Math.max(left, right);
  }

  public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

}
