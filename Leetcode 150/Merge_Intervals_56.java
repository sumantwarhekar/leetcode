class Solution {                                                        // https://www.youtube.com/watch?v=dzNIPX7HY6A
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> answer = new ArrayList<>();

        int[] newInterval = intervals[0];
        answer.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else{
                newInterval = interval;
                answer.add(newInterval);
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }
}