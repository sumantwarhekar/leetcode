class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for(int num:nums){
            totalSum += num;
        }

        int maxSum = KA_Max(nums, n);
        int minSum = KA_Min(nums, n);

        int circSum = totalSum - minSum;

        if(maxSum>0){ 
            return Math.max(maxSum, circSum);
        }

        return maxSum;
    }

    private int KA_Max(int[] nums, int n){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    private int KA_Min(int[] nums, int n){
        int currentSum = nums[0];
        int minSum = nums[0];

        for(int i=1;i<n;i++){
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }
}