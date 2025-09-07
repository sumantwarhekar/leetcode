class Solution {                                            // https://www.youtube.com/watch?v=9kyHYVxL4fw
    public int jump(int[] nums) {
        int jumps = 0;
        int destination = nums.length - 1;
        int coverage=0, lastJumpIndex=0;

        if(nums.length == 1) return 0;

        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage, i+nums[i]);

            if(i==lastJumpIndex){
                lastJumpIndex=coverage;
                jumps++;

                if(coverage>=destination){
                    return jumps;
                }
            }
        }
        return jumps;
    }
}