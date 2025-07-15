class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i] = new int[]{nums1[i], nums2[i]};
        }
        Arrays.sort(pairs,(a,b) -> b[1] - a[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a,b)-> a-b);
        long pqSum = 0;
        for(int i=0;i<k;i++){
            pqSum += pairs[i][0];
            pq.add(pairs[i][0]);
        }

        long answer = pqSum * pairs[k-1][1];

        for(int i=k;i<n;i++){
            pqSum += pairs[i][0] - pq.poll();
            pq.add(pairs[i][0]);
            answer = Math.max(answer, pqSum * pairs[i][1]);
        }
        return answer;
    }
}