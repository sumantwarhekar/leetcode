class Solution {                                                // https://www.youtube.com/watch?v=aqVW8IuXUF0
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        if (matrix.length == 0) {
            return answer;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin= 0;
        int colEnd= matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){

            for(int i=colBegin;i<=colEnd;i++)
                answer.add(matrix[rowBegin][i]);
            
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++)
                answer.add(matrix[i][colEnd]);

            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    answer.add(matrix[rowEnd][j]);
                }
            }

            rowEnd--;

            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    answer.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return answer;
    }
}