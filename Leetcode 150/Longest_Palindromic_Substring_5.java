class Solution {
    private int[][] t;
    
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int startIdx = 0;
        t = new int[n][n];

 
        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){
                if(j-i+1 > maxLen && solve(s, i, j)){
                    startIdx = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(startIdx, startIdx + maxLen);
    }

    private boolean solve(String s, int l, int r){
        if(l>=r)
            return true;

        if(t[l][r] != 0)
            return t[l][r]==1;

        if(s.charAt(l) == s.charAt(r)){
            t[l][r] = solve(s, l+1, r-1) ? 1 : 2;
        }else{
            t[l][r] = 2;
        }

        return t[l][r] == 1;
    }
}