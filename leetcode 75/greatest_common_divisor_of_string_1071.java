class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // always make sure str1 length is greater than str2
        if(!(str1+str2).equals(str2+str1))
            return "";
        
        int substringlength = gcd(str1.length(),str2.length());
        return str1.substring(0,substringlength);
    }

    public int gcd(int str1length, int str2length){
        if(str2length==0)
            return str1length;

        return gcd(str2length,str1length%str2length);
    }
}