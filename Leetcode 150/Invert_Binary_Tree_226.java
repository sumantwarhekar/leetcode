// Method 1 : Recursion
class Solution {                                            // https://www.youtube.com/watch?v=ck23lNqbLjI
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode leftSide = invertTree(root.left);
        TreeNode rightSide = invertTree(root.right);

        root.left = rightSide;
        root.right = leftSide;

        return root;
    }
}

// Method 2 : Iterative
class Solution2 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        final Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            final TreeNode node = q.poll();

            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null) 
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);
        }
        return root;
    }
}