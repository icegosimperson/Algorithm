class 450. Delete Node in a BST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            if(root.left==null && root.right==null){
                return null;
            } else if(root.left!=null && root.right!=null){
                TreeNode minNode = root.right;
                while(minNode.left!=null){
                    minNode = minNode.left;
                }
                root.val = minNode.val;
                root.right = deleteNode(root.right, minNode.val);
                return root;
            } else{
                if(root.left==null){
                    return root.right;
                }
                if(root.right==null){
                    return root.left;
                }
            }
        } else if(root.val<key){
            root.right = deleteNode(root.right, key);
            return root;
        } else{
            root.left = deleteNode(root.left, key);
            return root;
        }
        return root;
    }
}