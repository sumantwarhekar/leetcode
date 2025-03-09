import java.util.*;
// 1st Approach : Using HashMap
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length, answer=0;

        Map<String,Integer> rowHash = new HashMap<>();
        Map<String,Integer> colHash = new HashMap<>();

        for(int[] row : grid){
            StringBuilder sb = new StringBuilder();
            for(int i : row){
                sb.append(i).append('_');
            }
            rowHash.put(sb.toString(),rowHash.getOrDefault(sb.toString(),0)+1);
        }

        for(int j=0;j<n;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(grid[i][j]).append('_');
            }
            colHash.put(sb.toString(),colHash.getOrDefault(sb.toString(),0)+1);
        }

        for(Map.Entry<String,Integer> entry : rowHash.entrySet()){
            String rHash = entry.getKey();
            if(colHash.containsKey(rHash)){
                answer += colHash.get(rHash) * rowHash.get(rHash);
            }
        }
        return answer;
    }
}

// 2nd Approach : Using Arrays
class Solution2 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        int[][] transGrid = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transGrid[j][i] = grid[i][j];
            }
        }

        int answer =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Arrays.equals(grid[i],transGrid[j]))
                    answer++;
            }
        }
        return answer;
    }
}