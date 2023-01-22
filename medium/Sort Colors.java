class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
            else
                two++;
        }
        int indx = 0;
        while (zero > 0) {
            nums[indx] = 0;
            zero--;
            indx++;
        }
        while (one > 0) {
            nums[indx] = 1;
            one--;
            indx++;
        }
        while (two > 0) {
            nums[indx] = 2;
            two--;
            indx++;
        }
    }
}