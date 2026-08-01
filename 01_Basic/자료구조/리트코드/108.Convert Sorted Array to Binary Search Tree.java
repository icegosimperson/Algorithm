/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class 108.Convert Sorted Array to Binary Search Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length-1);
    }
    public TreeNode dfs(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode cur = new TreeNode(nums[mid]);
        cur.left=dfs(nums, left, mid-1);
        cur.right=dfs(nums, mid+1, right);
        return cur;
    }
}