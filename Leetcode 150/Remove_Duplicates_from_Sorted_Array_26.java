class Solution {                                    // https://www.youtube.com/watch?v=06ALbFrgIoQ
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}