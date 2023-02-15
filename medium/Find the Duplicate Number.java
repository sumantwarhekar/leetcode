import java.util.*;

// Solution 1
class Solution1 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                answer = nums[i];
        }
        return answer;
    }
}

// Soluiton 2
class Solution2 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> noRepeat = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (noRepeat.contains(nums[i]))
                return nums[i];
            else
                noRepeat.add(nums[i]);
        }
        return 0;
    }
}