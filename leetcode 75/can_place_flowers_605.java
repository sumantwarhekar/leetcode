class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;

        int flowersPlaced = 0;

        for(int i=0;i<flowerbed.length && flowersPlaced<n ;i++){
            if(flowerbed[i]==0){
                int previous = (i==0)? 0: flowerbed[i-1];
                int next = (i==flowerbed.length-1)?0:flowerbed[i+1];

                if(previous==0 && next==0){
                    flowerbed[i]=1;
                    flowersPlaced++;
                }
            }

        }
        return flowersPlaced==n;
    }
}