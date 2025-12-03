class Solution {                                                // https://www.youtube.com/watch?v=Op6YFcs8R9M

    public int maxSum;

    public int solve(TreeNode root){
        if(root==null)
            return 0;
        
        int left = solve(root.left);
        int right = solve(root.right);

        int bottomLeafNodeAnswers = left + right + root.val;
        int bestOfBoth = Math.max(left,right) + root.val;
        int bestRoot = root.val;

        maxSum = Math.max(maxSum, Math.max(bottomLeafNodeAnswers, Math.max(bestOfBoth, bestRoot)));

        return Math.max(bestOfBoth, bestRoot);
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
}