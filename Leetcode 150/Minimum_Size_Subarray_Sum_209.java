class Solution {                                                // https://www.youtube.com/watch?v=9UOmXgG4h2U
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int currentSum=0;

        int low=0;
        int high=0;

        while(high < nums.length){
            currentSum += nums[high];
            high++;

            while(currentSum >= target){
                int currentWindowLen = high - low;
                minLen = Math.min(minLen, currentWindowLen);

                currentSum-=nums[low];
                low++;
            }
        }

        return minLen == Integer.MAX_VALUE? 0 : minLen;
    }
}