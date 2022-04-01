package PathSum;

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;

        if(root.val==targetSum && root.left==null && root.right==null)
            return true;

        boolean a=false,b=false;

        if(root.left!=null)
            a=  hasPathSum(root.left, targetSum-root.val);

        if(root.right!=null)
            b=  hasPathSum(root.right, targetSum-root.val);

        return(a||b);
    }

}
