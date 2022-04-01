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

        if(root == null) {
            return new TreeNode(val);
        }

        TreeNode head = root;
        while(true) {
            if(head.val <= val) {
                if(head.right != null) {
                    head = head.right;
                } else {
                    head.right = new TreeNode(val);
                    break;
                }
            } else {
                if(head.left != null) {
                    head = head.left;
                } else {
                    head.left = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
    }

}
