class Solution {                                                // https://www.youtube.com/watch?v=BnOjzXe6J-Y
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            int lastValue = 0;

            for(int i=0;i<levelSize;i++){
                TreeNode node = q.poll();
                lastValue = node.val;

                if(node.left != null) 
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            answer.add(lastValue);
        }
        return answer;
    }
}