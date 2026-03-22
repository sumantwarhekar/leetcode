class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp =  new int[n+1][n+1];

        for(int level=n-1; level>=0; level--){
            for(int element=0; element<=level; element++){
                dp[level][element] = triangle.get(level).get(element) + Math.min(dp[level+1][element], dp[level+1][element+1]); 
            }
        }

        return dp[0][0];
    }
}