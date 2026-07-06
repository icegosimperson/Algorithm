class 1372. Longest ZigZag Path in a Binary Tree {
    int max=0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left, true, 1);
        dfs(root.right, false, 1);
        return max;
    }
    public void dfs(TreeNode root, boolean isLeft, int length){
        if(root==null){
            return;
        }
        max = Math.max(max, length);
        if(isLeft){
            dfs(root.left, true, 1);
            dfs(root.right, false, length+1);
        } else{
            dfs(root.left, true, length+1);
            dfs(root.right, false, 1);
        }
    }
}