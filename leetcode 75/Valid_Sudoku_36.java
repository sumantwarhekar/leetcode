class Solution {                                                                // https://www.youtube.com/watch?v=dGZjzA9zLW8
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> st = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c == '.') continue;

                String row = c + "row" + i;
                String col = c + "col" + j;
                String box = c + "box" + (i/3) + "_" + (j/3);

                if(st.contains(row) || st.contains(col) || st.contains(box))
                    return false;

                st.add(row);
                st.add(col);
                st.add(box);
            }
        }

        return true;
    }
}