class Solution {                                                    // https://www.youtube.com/watch?v=fOaUh1_fJPw
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        int totalCost = 0;
        int totalGas = 0;

        for(int i=0;i<n;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalGas < totalCost)
            return -1;

        int currentGas = 0;
        int startIndex = 0;

        for(int i=0;i<n;i++){
            currentGas += gas[i] - cost[i];

            if(currentGas<0){
                startIndex=i+1;
                currentGas=0;
            } 
        }

        return startIndex;
    }
}