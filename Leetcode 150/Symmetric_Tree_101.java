// Method 1 : Recursion                                                         // https://www.youtube.com/watch?v=nKggNAiEpBE
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) 
            return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isMirror(left.left, right.right)
            && isMirror(left.right, right.left);
    }
}

// Method 2 : Iterative
class Solution2 {                                                               // https://www.youtube.com/watch?v=8I8ulUJzibg
    public boolean isSymmetric(TreeNode root) {                                 
        if(root == null)
            return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            if(left==null && right==null)
                continue;
            if(left==null || right==null || left.val != right.val)
                return false;

            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }

        return true;
    }
}