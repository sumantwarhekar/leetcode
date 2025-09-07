class Solution {                                    // https://www.youtube.com/watch?v=Gtugy3mRV-A
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int finalPosition = n - 1;

        for(int i=n-2;i>=0;i--){
            if(i+nums[i]>=finalPosition){
                finalPosition = i;
            }
        }

        return finalPosition == 0;
    }
}