class Solution {
    public boolean isPalindrome(int x) {
        int given = x;
        int temp=0;
        while(given!=0){
            int reminder = given % 10;
            temp = temp*10 + reminder;
            given = given / 10;
        }
        if(x==temp){
            return true;
        }
        else
            return false;
    }
}