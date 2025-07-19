class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;

        int[] answer = new int[n];
        int maxPotion = potions[m-1];

        for(int i=0;i<n;i++){
            int spell = spells[i];

            long minPotion = (long) Math.ceil((1.0*success)/spell);

            if(minPotion > maxPotion){
                answer[i] = 0;
                continue;
            }

            int index = lowerBound(potions, (int) minPotion);
            answer[i] = m - index;
        }
        return answer;
    }

    public int lowerBound(int[] arr, int key){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = left + (right - left) / 2;
            if(arr[mid]<key)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}