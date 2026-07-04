import java.util.*;
class 1161. Maximum Level Sum of a Binary Tree {
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int level=0;
        int maxLevel=1;
        int maxSum=Integer.MIN_VALUE;
        queue.offer(root);
        while(!queue.isEmpty()){
            level++;
            int n = queue.size();
            int sum=0;
            for(int i=0; i<n; i++){
                TreeNode cur = queue.poll();
                sum += cur.val;
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            if(maxSum<sum){
                maxSum = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}