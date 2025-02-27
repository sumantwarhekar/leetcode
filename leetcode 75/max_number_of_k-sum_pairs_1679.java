import java.util.*;
// 1st Approach: Two pointer with Sorting
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count=0;
        int left=0;
        int right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]<k){
                left++;
            }
            else if(nums[left]+nums[right]>k){
                right--;
            }
            else{
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}

// 2nd Approach: Hashmap
class Solution2 {
    public int maxOperations(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;

        for(int i=0;i<nums.length;i++){
            int result = k - nums[i];

            if(map.containsKey(result)){
                count++;
                if(map.get(result)==1){
                    map.remove(result);
                }
                else{
                    map.put(result,map.get(result)-1);
                }
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}