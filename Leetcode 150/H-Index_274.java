class Solution {                                    // https://www.youtube.com/watch?v=zzTUtpBQh4k
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        int i;
        for (i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}