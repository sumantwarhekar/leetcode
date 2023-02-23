class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[] { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                answer[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}