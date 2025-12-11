 class Solution {                                                   // https://youtu.be/115txA-rS5s
    public List<Double> averageOfLevels(TreeNode root) {        
        Queue<TreeNode> lq = new LinkedList<>();
        lq.add(root);
        lq.add(null);

        List<Double> avgList = new ArrayList<>();

        while(lq.peek() != null){
            double sum = 0.0;
            int nodes = 0;

            while(lq.peek() != null){
                TreeNode node = lq.poll();
                sum += node.val;
                nodes++;

                if(node.left != null)
                    lq.add(node.left);
                if(node.right != null)
                    lq.add(node.right);
            }
            lq.add(lq.poll());
            avgList.add(sum/nodes);
        }
        return avgList;
    }
}