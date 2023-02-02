import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger givenOne = new BigInteger(num1);
        BigInteger givenTwo = new BigInteger(num2);
        BigInteger answer = givenOne.multiply(givenTwo);
        return answer.toString();
    }
}