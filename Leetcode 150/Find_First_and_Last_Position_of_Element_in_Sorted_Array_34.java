class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]=i;
                while(i<nums.length-1 && nums[i+1]==target){
                    i++;
                }
                result[1]=i;
                break;
            }
        }
        
        return result;
    }
}