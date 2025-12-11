class Solution {                                        // https://www.youtube.com/watch?v=9TJYWh0adfk
    int count=0;
    int result=0;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    private void traverse(TreeNode node, int k){
        if(node==null) return;

        traverse(node.left,k);
        count++;
        if(count==k){
            result = node.val;
            return;
        }
        traverse(node.right, k);
    }
}