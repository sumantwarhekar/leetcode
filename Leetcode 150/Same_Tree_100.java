// Method 1: Recursion                                          // https://youtu.be/BhuvF_-PWS0
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p==null || q==null)
        return (p==q);

    return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  
    }
}

// Method 2: Iterative                                         // https://www.youtube.com/watch?v=YPIaDOU4ZWc
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
            queue.add(p);
            queue.add(q);

    // Loop till the queue is not empty
        while (!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

      // Check for equality
            if (first == null && second == null) {
                continue;
            }   else if (
                first == null || second == null || first.val != second.val) {
                return false;
            }

      // Add other nodes
            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        } 
        return true;
    }
}