class Solution {                                                            // https://www.youtube.com/watch?v=zfcGwzfDNu0
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;

        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));

        int prev[] = points[0];
        int count=1;

        for(int i=1;i<points.length;i++){
            int curStart = points[i][0];
            int curEnd = points[i][1];

            int prevStart = prev[0];
            int prevEnd = prev[1];

            if(curStart > prevEnd){
                count++;
                prev = points[i];
            }
            else{  
                prev[0] = Math.max(prevStart, curStart);
                prev[1] = Math.min(prevEnd, curEnd);
            }
        }
        return count;
    }
}