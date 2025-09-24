class Solution {                                                                        // https://www.youtube.com/watch?v=VOI9wqr1JpQ
    public String intToRoman(int num) {
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder answer = new StringBuilder();
        int i=0;

        while(num>0){
            while(num >= values[i]){
                answer.append(roman[i]);
                num -= values[i];
            }
            i++;
        }
        return answer.toString();
    }
}