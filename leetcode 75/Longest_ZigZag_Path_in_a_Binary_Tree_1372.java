class Solution {
    int answer=0;
    
    public void dfs(TreeNode node, boolean goLeft, int steps){
        if(node==null){
            return;
        }
        answer = Math.max(answer,steps);

        if(goLeft){
            dfs(node.left,false,steps+1);
            dfs(node.right,true,1);
        }
        else{
            dfs(node.left,false,1);
            dfs(node.right,true,steps+1);
        }
    }

    public int longestZigZag(TreeNode root) {
        dfs(root,true,0);
        return answer;
    }
}