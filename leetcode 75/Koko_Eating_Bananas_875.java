class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findMax(piles);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int totalH = calculateHours(piles, mid);

            if (totalH <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private int calculateHours(int[] piles, int speed) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += Math.ceil((double)pile / speed);
        }
        return totalHours;
    }
}
