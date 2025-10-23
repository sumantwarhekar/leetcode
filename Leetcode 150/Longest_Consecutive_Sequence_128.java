class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest=0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentLongest = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentLongest += 1;
                }
                longest = Math.max(longest, currentLongest);
            }
        }
        return longest;
    }
}