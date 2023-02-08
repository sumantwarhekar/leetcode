// 1st Solution
class Solution1 {
    public String defangIPaddr(String address) {
        String answer = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                answer += "[.]";
            } else {
                answer += address.charAt(i);
            }
        }
        return answer;
    }
}

// 2nd Solution
class Solution2 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

// 3rd Solution
class Solution3 {
    public String defangIPaddr(String address) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                answer.append("[.]");
            else
                answer.append(address.charAt(i));
        }

        return answer.toString();
    }
}