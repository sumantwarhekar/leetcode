class Solution {                                                // https://www.youtube.com/watch?v=PyYZCJRAMmY
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int start = nums[i];

            while(i+1 < n && nums[i+1] - nums[i] == 1){
                i++;
            }

            if(start != nums[i]){
                answer.add(start + "->" + nums[i]);
            }
            else{
                answer.add(String.valueOf(start));
            } 
        }
        return answer;
    }
}