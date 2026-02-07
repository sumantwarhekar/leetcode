class Solution {

    private void findCombinations(int idx, int[] candidates, int target, List<List<Integer>> result, List<Integer> temp){
        if(idx==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            findCombinations(idx, candidates, target-candidates[idx],result, temp);
            temp.remove(temp.size()-1);
        }
        findCombinations(idx+1, candidates, target, result, temp);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, candidates, target, result, new ArrayList<>());
        return result;
    }
}