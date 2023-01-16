class Solution{
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            if(current<0){
                current=0;
            }
            current+=nums[i];
            maxsum=Math.max(current,maxsum);
        }
        return maxsum;
    }
}