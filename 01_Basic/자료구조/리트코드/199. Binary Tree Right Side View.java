import java.util.*;
class 199. Binary Tree Right Side View {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode cur = queue.poll();
                if(i==level-1){
                    list.add(cur.val);
                }
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        return list;
    }
}