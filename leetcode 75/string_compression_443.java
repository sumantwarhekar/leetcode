class Solution {                                                // Two pointer method
    public int compress(char[] chars) {
        int i=0;
        int idx =0;

        while(i < chars.length){
            int j=i;

            while (j < chars.length && chars[i]==chars[j]){
                j++;
            }

            chars[idx++] = chars[i];
            int length = j - i;

            if(length > 1){
                String s = String.valueOf(length);
                for(char c : s.toCharArray()){
                    chars[idx++]=c;
                }
            }

            i=j;
        }
        return idx;
    }
}