// 1st Approach: Two pointer approach
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;

        int s_pointer=0;
        int t_pointer=0;

        while(t_pointer<t.length()){
            if(s.charAt(s_pointer)==t.charAt(t_pointer)){
                s_pointer++;

                if(s_pointer==s.length())
                    return true;
            }
            t_pointer++;
        }
        return false;
    }
}

// 2nd Approach: Two poointers approach but more polished
class Solution2 {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return (i==s.length());
    }
}


