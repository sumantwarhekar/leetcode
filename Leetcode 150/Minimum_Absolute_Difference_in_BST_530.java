class Solution {                                                    // https://www.youtube.com/watch?v=yNvt9ejf9Ec
    TreeNode prev =null;
    
    public int getMinimumDifference(TreeNode root) {
        return inOrder(root);
    }

    public int inOrder(TreeNode root){
        int minAbsDiff = Integer.MAX_VALUE;
        if(root==null)
            return minAbsDiff;

        minAbsDiff = Math.min(minAbsDiff, inOrder(root.left));

        if(null != prev)
            minAbsDiff = Math.min(minAbsDiff, root.val - prev.val);

        prev = root;
        minAbsDiff = Math.min(minAbsDiff, inOrder(root.right));
        return minAbsDiff;
    }
}