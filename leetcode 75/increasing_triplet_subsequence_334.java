class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int number : nums){
            if(number <= first)
                first = number;
            else if(number <= second)
                second = number;
            else
                return true;
        }
        return false;
    }
}