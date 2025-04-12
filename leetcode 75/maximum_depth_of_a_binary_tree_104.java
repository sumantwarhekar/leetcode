// 1st Approach:  BFS Traversal method                      https://www.youtube.com/watch?v=o2LEC2NEVuk
import java.util.*;
class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int numberOfLevels = 0;

        while(true){

            int nodeCountAtLevel = queue.size();
            if(nodeCountAtLevel == 0){
                return numberOfLevels;
            }

            while(nodeCountAtLevel > 0){
                TreeNode element = queue.poll();

                if(element.left!=null)
                    queue.add(element.left);
                if(element.right!=null)
                    queue.add(element.right);

                nodeCountAtLevel--;
            }
            numberOfLevels++;
        }
    }
}

// 2nd Approach : Recusrsion                                https://www.youtube.com/watch?v=jMpi-_NWfZM
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth,rightDepth);
    }
}

