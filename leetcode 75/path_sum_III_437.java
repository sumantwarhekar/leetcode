class Solution {                                                    // https://www.youtube.com/watch?v=P6lZ4c9BKQU
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        
        int n = dfs(root, (long) targetSum);
        int leftSum = pathSum(root.left,targetSum);
        int rightSum = pathSum(root.right, targetSum);

        return n + leftSum + rightSum;
    }
    public int dfs(TreeNode node, long targetSum){
        if(node==null)
            return 0;

        int sum = 0;
        if(targetSum==node.val){
            sum++;
        }

        sum+=dfs(node.left, targetSum - node.val);
        sum+=dfs(node.right, targetSum - node.val);
        return sum;
    }
}