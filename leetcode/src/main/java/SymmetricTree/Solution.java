package SymmetricTree;

public class Solution {

  public boolean isSymmetric(TreeNode root) {
    return isMirrored(root, root);
  }

  public boolean isMirrored(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }
    if (t1 == null || t2 == null) {
      return false;
    }
    return (t1.val == t2.val)
        && isMirrored(t1.right, t2.left)
        && isMirrored(t1.left, t2.right);
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
