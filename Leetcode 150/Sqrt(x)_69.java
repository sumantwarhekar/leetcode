class Solution {
    public int mySqrt(int x) {
        long low = 1, high = x;

        while(low<=high){
            long mid = low + (high - low) / 2;
            long sqr = mid * mid;
            if(x >= sqr)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (int) high;
    }
}