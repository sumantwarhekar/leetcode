class Solution {                                                            // https://www.youtube.com/watch?v=EoAsWbO7sqg
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>>wrapList = new LinkedList<List<Integer>>();

        if(root==null)
            return wrapList;

        q.offer(root);

        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                subList.add(q.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}