class Solution {
    int m, n, N;
    int[][] t = new int[101][101];

    private boolean solve(int i, int j, String s1, String s2, String s3){
        if(i==m && j==n && i+j==N)
            return true;

        if(i+j >= N)
            return false;

        if(t[i][j] != -1)
            return t[i][j] == 1;

        boolean result = false;

        if(i<m && s1.charAt(i) == s3.charAt(i+j))
            result = solve(i+1, j, s1, s2, s3);

        if(result==true){
            t[i][j] = 1;
            return true;
        }

        if(j<n && s2.charAt(j) == s3.charAt(i+j))
            result = solve(i, j+1, s1, s2, s3);

        t[i][j] = result ? 1 : 0;
        return result;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        m = s1.length();
        n = s2.length();
        N = s3.length();

        for(int i=0;i<101;i++){
            java.util.Arrays.fill(t[i], -1);
        }

        return solve(0,0, s1, s2, s3);
    }
}