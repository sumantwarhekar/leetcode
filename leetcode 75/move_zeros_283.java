class Solution {                            // Two pointer method
    public void moveZeroes(int[] nums) {
        int len = nums.length;

        if(len<2) 
        return;

        int l=0,r=1;

        while(r<len){
            if(nums[l]!=0){
                l++;
                r++;
            }
            else if(nums[r]==0){
                r++;
            }
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
    }
}