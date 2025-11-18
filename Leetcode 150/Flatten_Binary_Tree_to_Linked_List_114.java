class Solution {                                        // https://www.youtube.com/watch?v=BLUK5D3vQLc
    public void flatten(TreeNode root) {
        if(root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;

        TreeNode p = root;
        while(p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}