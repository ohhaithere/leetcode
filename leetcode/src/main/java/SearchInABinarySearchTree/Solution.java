package SearchInABinarySearchTree;

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

    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode head = root;
        while(head != null) {
            if (head.val == val) {
                return  head;
            }
            if (head.val < val) {
                head = head.right;
            } else {
                head = head.left;
            }
        }

        return null;
    }

}
