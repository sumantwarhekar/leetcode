class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        List<List<Integer>> result = new ArrayList<>();

        if(m==0 || n==0 || k==0) return result;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        Set<String> visited = new HashSet<>();

        pq.offer(new int[]{nums1[0] + nums2[0], 0,0});
        visited.add("0,0");

        while(k-->0 && !pq.isEmpty()){
            int[] current = pq.poll();
            int i = current[1];
            int j = current[2];

            result.add(Arrays.asList(nums1[i], nums2[j]));

            if(i+1<m && !visited.contains((i+1) + "," + j)){
                pq.offer(new int[]{nums1[i+1] + nums2[j], i+1, j});
                visited.add((i+1 + "," + j));
            }

            if(j+1<n && !visited.contains(i + "," + (j+1))){
                pq.offer(new int[]{nums1[i] + nums2[j+1], i, j+1});
                visited.add(i + "," + (j+1));
            }
        }
        return result;
    }
}