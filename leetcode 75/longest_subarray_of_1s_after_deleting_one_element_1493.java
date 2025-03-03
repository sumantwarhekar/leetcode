class Solution {
    public int longestSubarray(int[] nums) {
        int prev=0;
        int curnt=0;
        int longOnes=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                curnt++;
            else{
                longOnes=Math.max(longOnes,prev+curnt);
                prev=curnt;
                curnt=0;
            }
        }
        longOnes=Math.max(longOnes,prev+curnt);
        
        if(longOnes==nums.length)
            return longOnes-1;
        else
            return longOnes;
    }
}