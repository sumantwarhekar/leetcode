class Solution {

    private Set<Integer> usedColIndex = new HashSet<>();
    private Set<Integer> used135DegreeDiagonal = new HashSet<>();
    private Set<Integer> used45DegreeDiagonal = new HashSet<>();
    private int count = 0;

    public int totalNQueens(int n) {
        helper(n, 0);
        return count;
    }

    public void helper(int n, int row){
        if(row==n){
            count++;
            return;
        }
        else{
            for(int col=0;col<n;col++){
                if(isValid(row, col)){
                    usedColIndex.add(col);
                    used135DegreeDiagonal.add(row+col);
                    used45DegreeDiagonal.add(row-col);
                    helper(n, row+1);
                    usedColIndex.remove(col);
                    used135DegreeDiagonal.remove(row + col);
                    used45DegreeDiagonal.remove(row - col);
                }
            }
        }

    }

    private boolean isValid(int row, int col){
        if(usedColIndex.contains(col) || used135DegreeDiagonal.contains(row+col) || used45DegreeDiagonal.contains(row-col)){
            return false;
        }
        else{
            return true;
        }
    }
}