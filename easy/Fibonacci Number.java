class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int t1=0;
        int t2=1;
        int t3=0;
        for(int i=2;i<=n;i++)
        {
            t3=t2+t1;
            t1=t2;
            t2=t3;
        }
        return t3;
    }
}