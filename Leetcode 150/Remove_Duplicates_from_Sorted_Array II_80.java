class Solution {                                        // https://www.youtube.com/watch?v=OZaADxYTfD4
    public int removeDuplicates(int[] nums) {
        if(nums.length<3)
            return 2;

        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
}