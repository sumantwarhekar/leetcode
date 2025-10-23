class Solution {                                                        // https://www.youtube.com/watch?v=AyiGBwFlMb8
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        int i=0, j=0;

        while(j<n){
            if(Math.abs(i-j)>k){
                set.remove(nums[i]);
                i++;
            }

            if(set.contains(nums[j])){
                return true;
            }

            set.add(nums[j]);
            j++;
        }

        return false;
    }
}