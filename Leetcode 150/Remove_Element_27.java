// 1st Method : Brute Force                             // https://www.youtube.com/watch?v=QrCds_6NiSk&t=2s
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

// 2nd Method : 2 Pointer Method                        // https://www.youtube.com/watch?v=oxcdk1uG_PU
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}