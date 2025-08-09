class Solution {                                        // https://www.youtube.com/watch?v=Iwmn-gFL3c0
    public int numTilings(int n) {
        final int mod = 1000000007;

        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 5;

        int[] dp = new int[n+1];
        dp[1]=1;;
        dp[2]=2;
        dp[3]=5;

        for(int i=4;i<=n;i++){
            long val = (2L * dp[i-1] + dp[i-3]) % mod;
            dp[i] = (int) val;
        }
        return dp[n];
    }
}