class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            mul *= remainder;
            n = n / 10;
        }
        return mul - sum;
    }
}