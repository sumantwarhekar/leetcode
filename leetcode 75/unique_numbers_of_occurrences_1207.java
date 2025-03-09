import java.util.*;
// 1st Approach: Checking whether occurance of number is unique or not
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> num_and_count = new HashMap<>();

        for(int val:arr){
            num_and_count.put(val,num_and_count.getOrDefault(val,0)+1);
        }

        HashSet<Integer> occurance = new HashSet<>();
        for(int num:num_and_count.keySet()){
            int frequency = num_and_count.get(num);
            if(!occurance.add(frequency)){
                return false;
            }
        }
        return true;
    }
}

// 2nd Approach: if all values and their occurances are unique that means they should have same length
class Solution2 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> num_and_count = new HashMap<>();

        for(int val:arr){
            num_and_count.put(val,num_and_count.getOrDefault(val,0)+1);
        }

        HashSet<Integer> unique_values = new HashSet<>(num_and_count.values());
        return num_and_count.size() == unique_values.size();
    }
}