class 113. Path Sum II {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum, new ArrayList<>());
        return result;
    }
    public void dfs(TreeNode root, int curSum, int targetSum, List<Integer> curPath){
        if(root==null){
            return;
        }
        curSum += root.val;
        curPath.add(root.val);
        if(root.left==null && root.right==null){
            if(curSum==targetSum){
                result.add(new ArrayList<>(curPath));
            }
        } else{
            dfs(root.left, curSum, targetSum, curPath);
            dfs(root.right, curSum, targetSum, curPath);
        }
        curPath.remove(curPath.size()-1);
    }
}