class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root,result,0);
        return result;        
    }

    public void rightView(TreeNode node, List<Integer> result,int currentDepth){
        if(node==null)
            return;

        if(currentDepth == result.size())
            result.add(node.val);

        rightView(node.right,result,currentDepth+1); // For left side view just do node.left
        rightView(node.left,result, currentDepth+1); // first then node.right
    }
                                                     
}