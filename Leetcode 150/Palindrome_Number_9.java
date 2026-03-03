class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int temp = 0;

        while(x>0){
            int rem = x %10;
            temp = (temp * 10) + rem;
            x=x/10; 
        }

        if(temp == original)
            return true;
        else
            return false;
    }
}