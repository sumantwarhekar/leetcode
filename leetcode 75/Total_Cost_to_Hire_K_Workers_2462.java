class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        int hired = 0;
        int i = 0, j = n - 1;

        while (hired < k) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i]);
                i++;
            }

            while (pq2.size() < candidates && j >= i) {
                pq2.offer(costs[j]);
                j--;
            }

            int minpq1 = pq1.isEmpty() ? Integer.MAX_VALUE : pq1.peek();
            int minpq2 = pq2.isEmpty() ? Integer.MAX_VALUE : pq2.peek();

            if (minpq1 <= minpq2) {
                ans += minpq1;
                pq1.poll();
            } 
            else {
                ans += minpq2;
                pq2.poll();
            }
            hired++;
        }
        return ans;  
    }
}