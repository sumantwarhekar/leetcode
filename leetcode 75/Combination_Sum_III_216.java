class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();

        solve(1, k, n, new ArrayList<>(), answer);
        return answer;
    }

    public void solve(int i, int k, int n, List<Integer> current, List<List<Integer>> answer){
            if(n==0 && k==0){
                answer.add(current);
                return;
            }

            if(i>9)
                return;
            if(n<0 || k<0)
                return ;

            List<Integer> temp = new ArrayList<>(current);
            temp.add(i);
            solve(i+1, k-1, n-i, temp, answer);
            solve(i+1, k, n, current, answer);
        }
}