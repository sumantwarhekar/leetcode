class Solution {                                            // https://www.youtube.com/watch?v=IIqVFvKE6RY
    public int candy(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int sum = 1;

        while(i<n){
            if(ratings[i] == ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }

            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak+=1;
                i++;
                sum+=peak;
            }

            int bottom=0;
            while(i<n && ratings[i]<ratings[i-1]){
                bottom+=1;
                i++;
                sum+=bottom;
            }

            bottom++;
            if(bottom>peak){
                sum+= bottom - peak;
            }
        }

        return sum;
    }
}