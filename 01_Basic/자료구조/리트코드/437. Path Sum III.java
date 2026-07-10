class 437. Path Sum III {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        return dfs(root, 0, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    public int dfs(TreeNode root, long curSum, long targetSum){
        if(root==null){
            return 0;
        }
        int count=0;
        curSum += root.val;
        if(curSum==targetSum){
            count++;
        }
        count += dfs(root.left, curSum, targetSum);
        count += dfs(root.right, curSum, targetSum);
        return count;
    }
    /*
        public int dfs(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = 0;
        if(root.val == targetSum) count++;
        count += dfs(root.left, targetSum - root.val);
        count += dfs(root.right, targetSum - root.val);
        return count;
    }
    */
}