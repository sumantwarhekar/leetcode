 class Solution {                                                       // https://www.youtube.com/watch?v=y6zSY_z7Kh4
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0 || inorder==null)
            return null;

        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inOrderIndexMap.put(inorder[i], i);
        }

        return splitTree(postorder, inOrderIndexMap, postorder.length-1, 0, inorder.length-1);
    }

    public TreeNode splitTree(int[] postorder, Map<Integer, Integer> inOrderIndexMap, int rootIndex, int left, int right){
        TreeNode root = new TreeNode(postorder[rootIndex]);

        int mid = inOrderIndexMap.get(postorder[rootIndex]);

        if(mid < right){
            int rightSize = right - mid;
            int rightRootIndex = rootIndex - 1;
            root.right = splitTree(postorder, inOrderIndexMap,rightRootIndex, mid + 1, right);
        }

        if(mid > left){
            int rightSize = right - mid;
            int leftRootIndex = rootIndex - rightSize - 1;
            root.left = splitTree(postorder, inOrderIndexMap,leftRootIndex, left, mid - 1);
        }

        return root;
    }
}