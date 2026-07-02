class 1448. Count Good Nodes in Binary Tree {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
    public int dfs(TreeNode root, int max){
        if(root==null){
            return 0;
        }
        int cnt=0;
        if(max<=root.val){
            cnt++;
            max = root.val;
        }
        cnt += dfs(root.left, max);
        cnt += dfs(root.right, max);
        return cnt;
    }
}