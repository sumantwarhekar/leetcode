class Solution {                                            // https://www.youtube.com/watch?v=LkD0D0Xy-ro
    public boolean isHappy(int n) {
        Set<Integer> repeat = new HashSet<>();

        while(true){
            int sum=0;
            while(n!=0){
                sum += Math.pow(n%10,2.0);
                n=n/10;
            }

            if(sum==1)
                return true;

            n=sum;

            if(repeat.contains(n))
                return false;
            
            repeat.add(n);
        }
    }
}