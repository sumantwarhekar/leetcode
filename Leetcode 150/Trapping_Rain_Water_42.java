class Solution {                                                                        // https://www.youtube.com/watch?v=UZG3-vZlFM4
    public int trap(int[] height) {             
        int n = height.length;
        int[] heightFromLeft = new int[n];
        int[] heightFromRight = new int[n];

        heightFromLeft[0] = height[0];
        for(int i=1;i<n;i++){
            heightFromLeft[i] = Math.max(heightFromLeft[i-1],height[i]);
        }

        heightFromRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            heightFromRight[i] = Math.max(heightFromRight[i+1],height[i]);
        }

        int waterTrapped = 0;
        for(int i=0;i<n;i++){
            waterTrapped += (Math.min(heightFromLeft[i],heightFromRight[i]) - height[i]);
        }

        return waterTrapped;
    }
}