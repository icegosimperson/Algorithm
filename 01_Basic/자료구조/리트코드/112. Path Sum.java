/**
 class Solution {
 public boolean hasPathSum(TreeNode root, int targetSum) {
 if(root==null){
 return false;
 }
 if(root.left==null && root.right==null){
 return targetSum == root.val;
 }
 return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
 }
 }
 */
class 112. Path Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return dfs(root, 0, targetSum);
    }
    public boolean dfs(TreeNode root, int curSum, int targetSum){
        if(root==null){
            return false;
        }
        curSum += root.val;
        if(root.left == null && root.right == null){
            return curSum == targetSum;
        }
        return dfs(root.left, curSum, targetSum) || dfs(root.right, curSum, targetSum);
    }
}