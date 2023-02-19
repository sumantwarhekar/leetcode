
// Solution 1
import java.util.*;

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

// Solution 2
class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> sorted = new PriorityQueue<>();
        for (int i : nums) {
            sorted.add(i);
            if (sorted.size() > k)
                sorted.remove();
        }
        return sorted.remove();
    }
}