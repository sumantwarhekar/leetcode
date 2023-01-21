// 1st Solution
class Solution1 {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len * 2];
        for (int i = 0; i < len * 2; i++) {
            answer[i] = nums[i % len];
        }
        return answer;
    }
}

// 2nd Solution
class Solution2 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}