class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer=0;
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                    case"--X":
                        --answer;
                        break;
                    case"X--":
                        answer--;
                        break;
                    case"++X":
                        ++answer;
                        break;
                    case"X++":
                        answer++;
                        break;
            }
        }
        return answer;
    }
}