import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int val: nums1){
            set1.add(val);
        }
        for(int val:nums2){
            set2.add(val);
        }

        ArrayList<Integer> answer1 = new ArrayList<>();
        ArrayList<Integer> answer2 = new ArrayList<>();

        for(int val:set1){
            if(!set2.contains(val)){
                answer1.add(val);
            }
        }
        for(int val:set2){
            if(!set1.contains(val)){
                answer2.add(val);
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);
        return answer;
    }
}