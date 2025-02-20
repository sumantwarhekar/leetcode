// 1st Approach: Diving array from two sides: Left and Right: storing their product in two different arrays
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] LP = new int[nums.length];
        int[] RP = new int[nums.length];

        for(int i=0, temp=1;i<nums.length;i++){
            LP[i] = temp;
            temp *= nums[i];
        }

        for(int i=nums.length-1, temp=1;i>=0;i--){
            RP[i] = temp;
            temp *= nums[i];
        }

        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i] = LP[i] * RP[i];
        }
        return answer;
    }
}

// 2nd Approach: Optimal Solution
class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] LP = new int[length];
        int[] RP = new int[length];

        LP[0]=1;
        for(int i=1;i<length;i++){
            LP[i]= LP[i-1]*nums[i-1];
        }

        RP[length-1]=1;
        for(int i=length-2;i>=0;i--){
            RP[i]=RP[i+1]*nums[i+1];
        }

        int[] answer = new int[length];
        for(int i=0;i<length;i++){
            answer[i]= LP[i] * RP[i];
        }

        return answer;
    }
}