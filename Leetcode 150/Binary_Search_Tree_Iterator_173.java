class BSTIterator {                                                     // https://www.youtube.com/watch?v=D2jMcmxU4bs
    public Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushAll(TreeNode node){
        for(; node!=null; stack.push(node), node=node.left);
    }
}
