// Method 1 : Iterative
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList = new LinkedList<>();

        helper(root, inOrderList);
        boolean isBST=true;
        int prev = inOrderList.get(0);

        for(int i=1;i<inOrderList.size();i++){
            if(inOrderList.get(i) <= prev)
                isBST = false;
            prev = inOrderList.get(i);
        }
        return isBST;
    }

    public void helper(TreeNode treeNode, List<Integer> inOrderList){
        if(treeNode == null)
            return;

        helper(treeNode.left, inOrderList);
        inOrderList.add(treeNode.val);
        helper(treeNode.right, inOrderList);
    }
}

// Method 2 : Recursion
class Solution2 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal){
        if(root == null)
            return true;

        if(root.val>=maxVal || root.val<=minVal)
            return false;

        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right, root.val, maxVal);
    }
}