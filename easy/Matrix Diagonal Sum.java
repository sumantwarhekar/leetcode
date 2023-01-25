class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++)
            answer = answer + mat[i][i] + mat[i][len - i - 1];
        if (len % 2 != 0)
            answer -= mat[len / 2][len / 2];
        return answer;
    }
}